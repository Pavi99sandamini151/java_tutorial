public String toLowerCase(Locale locale) {  
        if (locale == null) {  
            throw new NullPointerException();  
        }  
  
        int firstUpper;  
        final int len = value.length;  
  
        /* Now check if there are any characters that need to be changed. */  
        scan: {  
            for (firstUpper = 0 ; firstUpper < len; ) {  
                char c = value[firstUpper];  
                if ((c >= Character.MIN_HIGH_SURROGATE)  
                        && (c <= Character.MAX_HIGH_SURROGATE)) {  
                    int supplChar = codePointAt(firstUpper);  
                    if (supplChar != Character.toLowerCase(supplChar)) {  
                        break scan;  
                    }  
                    firstUpper += Character.charCount(supplChar);  
                } else {  
                    if (c != Character.toLowerCase(c)) {  
                        break scan;  
                    }  
                    firstUpper++;  
                }  
            }  
            return this;  
        }  
  
        char[] result = new char[len];  
        int resultOffset = 0;  /* result may grow, so i+resultOffset 
                                * is the write location in result */  
  
        /* Just copy the first few lowerCase characters. */  
        System.arraycopy(value, 0, result, 0, firstUpper);  
  
        String lang = locale.getLanguage();  
        boolean localeDependent =  
                (lang == "tr" || lang == "az" || lang == "lt");  
        char[] lowerCharArray;  
        int lowerChar;  
        int srcChar;  
        int srcCount;  
        for (int i = firstUpper; i < len; i += srcCount) {  
            srcChar = (int)value[i];  
            if ((char)srcChar >= Character.MIN_HIGH_SURROGATE  
                    && (char)srcChar <= Character.MAX_HIGH_SURROGATE) {  
                srcChar = codePointAt(i);  
                srcCount = Character.charCount(srcChar);  
            } else {  
                srcCount = 1;  
            }  
            if (localeDependent || srcChar == '\u03A3') { // GREEK CAPITAL LETTER SIGMA  
                lowerChar = ConditionalSpecialCasing.toLowerCaseEx(this, i, locale);  
            } else if (srcChar == '\u0130') { // LATIN CAPITAL LETTER I DOT  
                lowerChar = Character.ERROR;  
            } else {  
                lowerChar = Character.toLowerCase(srcChar);  
            }  
            if ((lowerChar == Character.ERROR)  
                    || (lowerChar >= Character.MIN_SUPPLEMENTARY_CODE_POINT)) {  
                if (lowerChar == Character.ERROR) {  
                    if (!localeDependent && srcChar == '\u0130') {  
                        lowerCharArray =  
                                ConditionalSpecialCasing.toLowerCaseCharArray(this, i, Locale.ENGLISH);  
                    } else {  
                        lowerCharArray =  
                                ConditionalSpecialCasing.toLowerCaseCharArray(this, i, locale);  
                    }  
                } else if (srcCount == 2) {  
                    resultOffset += Character.toChars(lowerChar, result, i + resultOffset) - srcCount;  
                    continue;  
                } else {  
                    lowerCharArray = Character.toChars(lowerChar);  
                }  
  
                /* Grow result if needed */  
                int mapLen = lowerCharArray.length;  
                if (mapLen > srcCount) {  
                    char[] result2 = new char[result.length + mapLen - srcCount];  
                    System.arraycopy(result, 0, result2, 0, i + resultOffset);  
                    result = result2;  
                }  
                for (int x = 0; x < mapLen; ++x) {  
                    result[i + resultOffset + x] = lowerCharArray[x];  
                }  
                resultOffset += (mapLen - srcCount);  
            } else {  
                result[i + resultOffset] = (char)lowerChar;  
            }  
        }  
        return new String(result, 0, len + resultOffset);  
    }  
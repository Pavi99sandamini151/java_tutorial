public class ReplaceAllExample2   
{  
// main method  
public static void main(String argvs[])  
{  
  
// input string  
String str = "JavaTpoint";  
System.out.println(str);  
  
String regex = "";  
// adding a white space before and after every character of the input string.  
str = str.replaceAll(regex, " ");  
  
System.out.println(str);  
  
}  
}  
public class StringGetCharsExample   
{  
// main method  
public static void main(String argvs[])  
{  
String str = "Welcome to JavaTpoint!";  
  
// creating a char arry of size 25  
char[] chArr = new char[25];    
  
// start and end indices are same  
int srcBeginIndex = 11;  
int srcEndIndex = 11;  
int dstBeginIndex = 2;  
  
try  
{    
// invoking the method getChars()  
str.getChars(srcBeginIndex, srcEndIndex, chArr, dstBeginIndex);    
System.out.println(chArr);    
}  
catch(Exception excpn)  
{  
System.out.println(excpn);  
}  
System.out.println("The getChars() method prints nothing as start and end indices are equal.");    
}  
}  
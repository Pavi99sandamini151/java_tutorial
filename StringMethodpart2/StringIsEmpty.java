public class StringIsEmpty 
{  
// main method  
public static void main(String argvs[])  
{  
// a blank string  
String str = "     ";  
int size = str.length();  
  
// trim the white spaces and after that  
// if the string results in the empty string   
// then the string is blank; otherwise, not.  
if(size == 0)  
{  
System.out.println("The string is empty. \n");  
}  
else if(size > 0 && str.trim().isEmpty())  
{  
System.out.println("The string is blank. \n");  
}  
else  
{  
System.out.println("The string is not blank. \n");  
}  
  
str = " Welcome to JavaTpoint.  ";  
size = str.length();  
if(size == 0)  
{  
System.out.println("The string is empty. \n");  
}  
if(size > 0 && str.trim().isEmpty())  
{  
System.out.println("The string is blank. \n");  
}  
else  
{  
System.out.println("The string is not blank. \n");  
}  
}  
}  
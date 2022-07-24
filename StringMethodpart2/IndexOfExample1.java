public class IndexOfExample1
{    
// main method  
public static void main(String argvs[])   
{     
  
String str = "Welcome to JavaTpoint";      
int count = 0;  
int startFrom = 0;  
for(; ;)  
{  
  
int index = str.indexOf('o', startFrom);  
  
if(index >= 0)  
{  
// match found. Hence, increment the count  
count = count + 1;  
  
// start looking after the searched index  
startFrom = index + 1;  
}  
  
else  
{  
// the value of index is - 1 here. Therefore, terminate the loop  
break;  
}  
  
}  
  
System.out.println("In the String: "+ str);   
System.out.println("The 'o' character has come "+ count + " times");  
}    
}    
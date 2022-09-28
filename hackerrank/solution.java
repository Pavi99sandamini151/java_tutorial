import java.util.*;  
class UserInputDemo   
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
System.out.print("Enter first number- ");  
int a= sc.nextInt();  
System.out.print("Enter second number- ");  
int b= sc.nextInt();  
System.out.print("Enter third number- ");  
int c= sc.nextInt();  
int d=a+b+c;  
System.out.println("Total= " +d);  
}  
}  


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;


public class Solution {
        Scanner sc= new Scanner(System.in);
        if(sc % 2 == 1)
        {
            System.out.println("Wierd");
        }
        else
        {
            if(sc>2 && sc<=5)
            {
                System.out.println("Not Weird");
            }
            else if(sc>5 && 20>=sc)
            {
                System.out.println("Wierd");
            }
            else
            {
                System.out.println("Not Weird");
            }
        }
}

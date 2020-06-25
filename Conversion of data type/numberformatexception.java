package javaconversion;
//If you don't have numbers in string literal, calling Integer.parseInt() or Integer.valueOf() methods throw NumberFormatException
//Java Program to demonstrate the case of NumberFormatException  
public class numberformatexception{  
public static void main(String args[]){  
String s="hello";  
int i=Integer.parseInt(s);   
System.out.println(i);  
}}

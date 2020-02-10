package hackerranktopics;
//instanceof is a keyword that is used for checking if a reference variable is containing a given type of object reference or not.
//relationship 
class Parent {  } 
class Child extends Parent { } 

class javainstanceofkeyword 
{ 
 public static void main(String[] args) 
 { 
     Child cobj = new Child(); 

     // A simple case 
     if (cobj instanceof Child) 
        System.out.println("cobj is instance of Child"); 
     else
        System.out.println("cobj is NOT instance of Child"); 

     // instanceof returns true for Parent class also  
     if (cobj instanceof Parent) 
        System.out.println("cobj is instance of Parent"); 
     else
        System.out.println("cobj is NOT instance of Parent"); 

     // instanceof returns true for all ancestors (Note : Object 
     // is ancestor of all classes in Java)  
     if (cobj instanceof Object) 
        System.out.println("cobj is instance of Object"); 
     else
        System.out.println("cobj is NOT instance of Object");            
 } 
}

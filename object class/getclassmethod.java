//Returns the class object of “this” object and used to get actual runtime class of the object.
//It can also be used to get metadata of this class. 
package objectclass;

public class getclassmethod 
{ 
    public static void main(String[] args) 
    { 
        Object obj = new String("Piyush"); 
        Class c = obj.getClass(); 
        System.out.println("Class of Object obj is : "
                           + c.getName()); 
    } 
} 

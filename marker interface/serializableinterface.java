package markerinterface;
import java.io.*; 

//By implementing Serializable interface 
//we make sure that state of instances of class A 
//can be saved in a file. 
class Aa implements Serializable 
{ 
 int i; 
 String s; 

 // A class constructor 
 public Aa(int i,String s) 
 { 
     this.i = i; 
     this.s = s; 
 } 
} 

public class serializableinterface 
{ 
 public static void main(String[] args) 
   throws IOException, ClassNotFoundException 
 { 
     Aa a = new Aa(20,"piyush"); 

     // Serializing 'a' 
     FileOutputStream fos = new FileOutputStream("xyz.txt"); 
     ObjectOutputStream oos = new ObjectOutputStream(fos); 
     oos.writeObject(a); 

     // De-serializing 'a' 
     FileInputStream fis = new FileInputStream("xyz.txt"); 
     ObjectInputStream ois = new ObjectInputStream(fis); 
     Aa b = (Aa)ois.readObject();//down-casting object 

     System.out.println(b.i+" "+b.s); 

     // closing streams 
     oos.close(); 
     ois.close(); 
 } 
} 
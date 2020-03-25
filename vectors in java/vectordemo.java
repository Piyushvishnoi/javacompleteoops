package linkedlistjava;
//Vectors are actually implementation of dynamic arrays i.e if we don't know the size of array that we have to used,
//then we can use vectors.
import java.util.Vector;

public class vectordemo {

	public static void main(String[] args) {
		Vector<String> v=new Vector<>(3);
		v.add("Piyush");
		v.add("Kanchan");
		v.add("Vishnoi");
		System.out.println("Vector contains: " + v);
System.out.println("Size is: " + v.size());
System.out.println("capacity is: " + v.capacity());
v.add("Vijay");
v.add("Vishnoi");
System.out.println("Size is: " + v.size());
System.out.println("capacity is: " + v.capacity()); //default capacity of vector
String s=v.elementAt(2);
System.out.println(s);
	}
	// boolean function
	import java.util.*; 
class Vector_demo { 
    { 
        ArrayList arr = new ArrayList(); 
        arr.add(3); 
        arr.add("geeks"); 
        arr.add("forgeeks"); 
        arr.add(4); 
  
        // createn default vector 
        Vector v = new Vector(); 
  
        // copying all element of array list int0 vector 
        v.addAll(arr); 
  
        // checking vector v 
        System.out.println("vector v:" + v);  
    } 
}

}

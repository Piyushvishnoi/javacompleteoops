package linkedlistjava;

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

}

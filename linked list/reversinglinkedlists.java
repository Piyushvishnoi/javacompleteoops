package linkedlistjava;

import java.util.Iterator;
import java.util.LinkedList;

public class reversinglinkedlists {

	public static void main(String[] args) {
 LinkedList <String> obj=new LinkedList<>();
 obj.add("Piyush");
 obj.add("Vishnoi");
 obj.add("Vijay");
 System.out.println(obj);
 Iterator obj1=obj.descendingIterator();
 while( obj1.hasNext())
 {
	System.out.println(obj1.next());
 }
 System.out.println(obj);
 

	}

}

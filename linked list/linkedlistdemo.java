package linkedlistjava;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistdemo {

	public static void main(String[] args) {
	LinkedList <Integer> obj=new LinkedList <Integer>();
	obj.add(4);
	obj.add(5);
	obj.add(1);
Iterator <Integer> obj1=obj.iterator();
while(obj1.hasNext())
{
	System.out.println(obj1.next());
}
	}

}

package linkedlistjava;

import java.util.LinkedList;

public class addinginandoflinkedlist {

	public static void main(String[] args) {
		LinkedList <String> obj=new LinkedList();
		obj.add("Piyush");
		obj.add("Vishnoi");
		System.out.println(obj);
obj.add(1,"Vijay");
System.out.println(obj);
LinkedList <String> obj1=new LinkedList();
obj1.add("Khushi");
obj1.add("vishnoi");
System.out.println(obj1);
obj.addAll(0,obj1);    // to add two linked list at which position
System.out.println(obj);
	}

}

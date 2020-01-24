package linkedlistjava;
//vector is synchronised, i.e only one thread can access the code at a time. 
//while in arrayList,no synchronisation is possible,Multiple threads can access the code at a time
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class vectorsvsarraylist {

	public static void main(String[] args) {
    ArrayList <Integer> obj=new ArrayList();
    obj.add(3);
    obj.add(4);
    System.out.println(obj);
    Iterator it=obj.iterator();
    while(it.hasNext())
    {
    	System.out.println(it.next());
    }
Vector <Integer> obj1=new Vector();
obj1.add(1);
obj1.add(2);
System.out.println(obj1);
Enumeration <Integer> en= obj1.elements();
while(en.hasMoreElements())
{
	System.out.println(en.nextElement());   //we can use iterator and enumeration in vector
}

	}

}

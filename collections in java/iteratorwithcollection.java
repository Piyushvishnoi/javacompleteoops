//Since there is no  index in interface collection but we can use iterator to iterate over all values 
package collectionandgenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iteratorwithcollection {

	public static void main(String[] args) {
		Collection values=new ArrayList();
		values.add(4);
		values.add(2);
		values.add(9);
		Iterator it=values.iterator(); //iterator is method name and Iterator is an interface
		
		while(it.hasNext())  //hasNext is a method used with iterator to check whether there is any next variable or not
			{
			System.out.println(it.next()); //next is a iterator method to fetch next method
			}
		
	}

}

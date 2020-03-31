//we cannot use index no in collection and arraylist
// Before Collection Framework (or before JDK 1.2) was introduced, the standard methods for grouping Java objects (or collections) were Arrays or Vectors or Hashtables. 
//All of these collections had no common interface.
package collectionandgenerics;
import java.util.ArrayList;  //package for ArrayList
import java.util.Collection; //package for collection

public class collectiondemo {

	public static void main(String[] args) {
		Collection values=new ArrayList();      //Collection is an interface
	values.add(4);
	values.add(2);
	values.add(9);
System.out.println(values);  //this will print all the values

	}

}

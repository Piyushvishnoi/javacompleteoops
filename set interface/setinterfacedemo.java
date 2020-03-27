package setinterface;
//List allows duplicates while Set doesn’t allow duplicate elements
//Set is an unordered collection, it doesn’t maintain any order. 
//There are few implementations of Set which maintains the order such as LinkedHashSet
//set can be implemented by hashset and treeset
import java.util.HashSet;
import java.util.Set;

public class setinterfacedemo {

	public static void main(String[] args) {
		Set <Integer> values=new HashSet<>();
		values.add(2);
		values.add(4);
		values.add(1);
		values.add(2); //here duplicate values can't be entered in set
		for(Integer i:values)
		{
			System.out.println(i);
		}
	}

}

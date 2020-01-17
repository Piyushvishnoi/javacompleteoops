package setinterface;

import java.util.Set;
import java.util.TreeSet;

public class treeclassimplementation {

	public static void main(String[] args) {
		Set <Integer> values=new TreeSet<>();  //in tree set we get ascending  order data
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

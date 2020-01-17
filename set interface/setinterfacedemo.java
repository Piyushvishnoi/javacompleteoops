package setinterface;

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

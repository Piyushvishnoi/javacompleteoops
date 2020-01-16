package listinterface;

import java.util.ArrayList;
import java.util.List;

public class listwithgenerics {

	public static void main(String[] args) {
		List <Integer> values=new ArrayList<>();
		values.add(4);
		values.add(2);
		values.add(9);
		//values.add("hi"); this is wrong because we have rsetricted the data type
for(Integer o:values) //use of enhanced loop
{
System.out.println(o);	
}
	}

}

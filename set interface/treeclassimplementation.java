package setinterface;
//in treeset interface we get ordered data by default
import java.util.Set;
import java.util.TreeSet;

public class treeclassimplementation {

	public static void main(String[] args) {
		Set <Integer> values=new HashSet<>();  //in Hash set we do not get  ordered data
		values.add(2);
		values.add(4);
		values.add(1);
		values.add(2); //here duplicate values can't be entered in set
		for(Integer i:values)
		{
			System.out.println(i);
		}
		TreeSet <Integer> obj1=new TreeSet<> (values); //here we get ordered values in ascending order by default unlike in hashset
		for(Integer i:obj1)
		{
			System.out.println(i);
		}
	}

}

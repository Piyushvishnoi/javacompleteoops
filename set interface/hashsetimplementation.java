package setinterface;
//In set interface values can't be repeated
import java.util.HashSet;
import java.util.Set;

public class hashsetimplementation {

	public static void main(String[] args) {
	Set <Integer> obj= new HashSet<>();
obj.add(2);
obj.add(3);
obj.add(4);
obj.add(2);
System.out.println(obj.add(2));

for(int i: obj)
{
	System.out.println(i);
}
	}

}

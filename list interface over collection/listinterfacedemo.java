package listinterface;
//benefits of list over collection interface
// we can make use of index in list so we can easily use array.
//here we can use function values.get() in list 
import java.util.ArrayList;
import java.util.List;


public class listinterfacedemo {

	public static void main(String[] args) {
List values=new ArrayList();
 values.add(4);
 values.add(2);
 values.add(5);
 values.add(1,3);
 for(Integer i=0;i<4;i++)
 {
	System.out.println(values.get(i)); 
 }

	}

}

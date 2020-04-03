package javalabexp;

import java.util.HashSet;

public class exp9que7 {

	public static void main(String[] args) {
		HashSet<Integer> obj= new HashSet<>();
obj.add(3);
obj.add(2);
obj.add(10);
obj.add(1);
HashSet newone=new HashSet();
newone=(HashSet)obj.clone();
System.out.println(newone);
//clearing all elements
newone.clear();
System.out.println("After clearing everything newone hashset will look like: "+ newone);
	System.out.println(obj.contains(3));
	}

}

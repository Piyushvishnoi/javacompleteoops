package javalabexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class exp9que5 {

	public static void main(String[] args) {
	ArrayList<Integer> obj=new ArrayList();
	obj.add(3);
	obj.add(5);
	obj.add(2);
	Iterator it=obj.iterator();
	while(it.hasNext())
	{
	System.out.println(it.next());	
	}
ArrayList newone=new ArrayList();
newone=(ArrayList)obj.clone();
System.out.println(newone);
Collections.reverse(obj);
System.out.println(obj);
	}

}

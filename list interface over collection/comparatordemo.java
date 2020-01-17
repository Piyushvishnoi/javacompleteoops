package collectionandgenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatordemo {

	public static void main(String[] args) {
		List <Integer> l=new ArrayList <Integer> ();
		l.add(309);
		l.add(1302);
		l.add(805);
		l.add(401);
		Comparator <Integer> c=new Comparator <Integer> ()  //comparator operator is used to compare according to our own needs
				{
			public int compare(Integer i,Integer j)
			{
				if(i%10>j%10)
				return 1;
				else
					return -1;
			}
				};
		Collections.sort(l,c); //here we have used object of comparator
		for(Integer o:l)
		{
			System.out.println(o);
		}
	}

}

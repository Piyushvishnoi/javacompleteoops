package setinterface;
//LinkedHashMap is a Hash table and linked list implementation of the Map interface, with predictable iteration order.
//This implementation differs from HashMap in that it maintains a doubly-linked list running through all of its entries. 
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class linkedhashmap {

	public static void main(String[] args) {
		 LinkedHashMap<Integer, String> lhmap = 
                 new LinkedHashMap<Integer, String>();

         //Adding elements to LinkedHashMap
         lhmap.put(22, "Abey");
         lhmap.put(33, "Dawn");
         lhmap.put(1, "Sherry");
         lhmap.put(2, "Karon");
         lhmap.put(100, "Jim");

         // Generating a Set of entries
         Set set = lhmap.entrySet();

         // Displaying elements of LinkedHashMap
         Iterator iterator = set.iterator();
         while(iterator.hasNext()) {
            Map.Entry me = (Map.Entry)iterator.next();
            System.out.print("Key is: "+ me.getKey() + 
                    "& Value is: "+me.getValue()+"\n");

	}

	}
}

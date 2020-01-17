package mapinterface;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class treeclassiasimplementor {

	public static void main(String[] args) {
		Map<String,String> values=new TreeMap<>();  //in treemap set we get shuffled order
		values.put("2","piyush");
		values.put("4","prakhar");
		values.put("1","adarsh");
		values.put("4", "overwritten"); //here if we use duplicate keys, data gets overwritten
		Set <String> keys=values.keySet();  //getting all the keys
		for(String k:keys)
		System.out.println(values.get(k));

	}

}

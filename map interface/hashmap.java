package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		Map<String,String> values=new HashMap<>();  //in hash set we get shuffled order
		values.put("2","piyush");
		values.put("4","prakhar");
		values.put("1","adarsh");
		System.out.println(values.get("4"));
	}
}

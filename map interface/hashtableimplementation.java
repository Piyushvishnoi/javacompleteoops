package mapinterface;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class hashtableimplementation {

	public static void main(String[] args) {
		Map <String,Integer> obj=new Hashtable<>();
		obj.put("Piyush",1);
		obj.put("Vishnoi",2);
		obj.put("Khushi",3);
		Set<String> keys= obj.keySet();
		for(String key:keys)
		{
			System.out.println(key+" "+obj.get(key));
		}
	}

}

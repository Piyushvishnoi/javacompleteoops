package javalabexp;

import java.util.HashMap;

public class exp9que6 {

	public static void main(String[] args) {
		HashMap <Integer,String> obj=new HashMap<>();
obj.put(1, "Piyush");
obj.put(2, "Vishnoi");
obj.put(3, "Khushi");
System.out.println(obj.containsKey(3));
System.out.println(obj.containsValue("Vishnoi"));
System.out.println(obj.keySet());
System.out.println(obj);
	}

}

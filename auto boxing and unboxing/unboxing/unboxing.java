package autoboxingunboxing;

public class unboxing {

	public static void main(String[] args) {
		Integer i=12;
		int j=i;  //here unboxing takes place i.e conversion of wrapper class to primitive implicitly
		System.out.println(j);
		
		System.out.println(i);
	}

}

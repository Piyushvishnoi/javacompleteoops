package javapolymorphism;

public class staticblock {
	static Integer i;
	static
	{
		System.out.println("In static block");
	}
	staticblock()
	{
		System.out.println("In constructor");
	}
	{
		System.out.println("in instance initialization block");
	}
	

	public static void main(String[] args) {
		staticblock obj=new staticblock();
		
	}

}

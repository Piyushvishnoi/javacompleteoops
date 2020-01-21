package javapolymorphism;

public class Instanceinitializationblock {
	
	Instanceinitializationblock()
	{
		System.out.println("In default constructor");
	}
	Instanceinitializationblock(int i)
	{
		System.out.println("In parametrized constructor");
	}
	{
		System.out.println("In instance initialazation block");
	}
	public static void main(String[] args) {
		Instanceinitializationblock obj=new Instanceinitializationblock();
		Instanceinitializationblock obj1=new Instanceinitializationblock(1);

	}

}

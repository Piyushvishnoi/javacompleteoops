package javalabexp;
import java.util.Scanner;
interface demooverriding
{
	void division();     //abstract methods
	default void modules()   //default methods which can be overridden
	{
		System.out.println("in parent interface and in module method");
	}
}
interface extendeddemo extends demooverriding   //extending another interface
{
	default void modules()   //overriding default method of parent interface
	{
		System.out.println("in  subinterface and in module method");
	}
}

public class exp5que4 implements extendeddemo {    //implementing subinterface

public void division()
{
	System.out.println("in division method");
}
	public static void main(String[] args) {
		exp5que4 obj=new exp5que4();      //making object because static to non-static can't be called
		System.out.println("Calling division function");
obj.division();
System.out.println("Calling module function");
obj.modules();
	}

}

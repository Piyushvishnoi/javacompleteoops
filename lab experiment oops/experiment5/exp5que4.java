package javalabexp;
import java.util.Scanner;
interface demooverriding
{
	void division();
	default void modules()
	{
		System.out.println("in parent interface and in module method");
	}
}
interface extendeddemo extends demooverriding
{
	default void modules()
	{
		System.out.println("in  subinterface and in module method");
	}
}

public class exp5que4 implements extendeddemo {

public void division()
{
	System.out.println("in division method");
}
	public static void main(String[] args) {
		exp5que4 obj=new exp5que4();
		System.out.println("Calling division function");
obj.division();
System.out.println("Calling module function");
obj.modules();
	}

}

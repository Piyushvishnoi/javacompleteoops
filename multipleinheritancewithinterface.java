package tutorial;
interface mydemo
{
	default void show()
	{
		System.out.println("in mydemo");
	}
}
interface Myanotherdemo
{
	default void show()
	{
		System.out.println("in my another demo");
	}
	
}
class Demoimple implements mydemo,Myanotherdemo
{
	public void show()
	{
		mydemo.super.show();     //used super keyword with particular interface name to avoid multiple inheritance problem
	Myanotherdemo.super.show();
	}
	
}
public class multipleinheritancewithinterface {

	public static void main(String[] args) {
		Demoimple d=new Demoimple();
		d.show();
	}

}

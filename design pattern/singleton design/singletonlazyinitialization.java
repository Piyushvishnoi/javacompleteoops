package designpatterninjava;
//In eager initialization,static object gets loaded at the time of class loading
//but what if object is consuming too many resources,hence without even using it,memory got wasted
//hence we overcome this by lazy initialization
public class singletonlazyinitialization {

	public static void main(String[] args) {
		Aa obj1=Aa.getinstance();
		Aa obj2=Aa.getinstance();

	}
}
class Aa
{
	static Aa obj;
	private Aa()
	{
		System.out.println("In private default constructor");
	}
	public static Aa getinstance()
	{
		System.out.println("lazy initialization,at the time of calling");
		obj=new Aa();
		return obj;
	}
}


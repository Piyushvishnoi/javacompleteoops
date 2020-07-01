package tutorial;
interface demo
{
	void show(); 
}
public class Interfacewithanonymousclas { 

	public static void main(String[] args) {
		demo d=new demo()     // we cannot make object of interface but using anonymous class we can make its object
				{             //hence we don't have to define an implementor class especialy for implementing interface
public void show()
{
	System.out.print("implementing interface using anonymous class");
}
				};
				d.show();

	}

}


package tutorial;
//Interface and abstract class are connected
//in abstract class we can declare and define any method, but in interface we can only declare a method ,
//we cannot define methods inside an interface
interface Writer
{
	void write(); //public void is by default in interface
}
class pen implements Writer
{
	public void write()
	{
		System.out.println("in pen");
	}
}
class pencil implements Writer
{
	public void write()
	{
		System.out.println("In pencil");
	}
}
class kit
{
	public void dosomething(Writer p)
	{
		p.write();
	}
}
public class interfacedemo {

	public static void main(String[] args) {
kit k=new kit();
Writer p=new pen();  //we can have reference for interface but we can't have objects for interface
Writer pc=new pencil();
k.dosomething(p);
	}

}

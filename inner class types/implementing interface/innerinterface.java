package innerclassandinterface;
interface outerdemo{
	interface innerdemo{
		void innershow();
	}
}
class A implements outerdemo.innerdemo
{
	public void innershow()
	{
		System.out.println("Implementing inner interface using class");
	}
}
public class innerinterface {

	public static void main(String[] args) {
		A obj=new A();
		obj.innershow();
		//in another way
		outerdemo.innerdemo obj1;
		obj1=new A();
		obj1.innershow();

	}

}

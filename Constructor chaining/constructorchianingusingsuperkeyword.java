//Constructor chaining using super  keyword
public class constructorchianingusingsuperkeyword {
class A
{ 
	A()
	{
		System.out.println("In base class default constructor"); 
	}
	A(String name) 
	{
		System.out.println("In base class parametrized constructor");
	}
} 
class B extends A
{
B()
{
	System.out.println("In derived class default constructor");
}
B(String name)
{ super(name);
	System.out.println("In derived class parametrized constructor");
}
}
	public static void main(String[] args) {
		B b=new B("Piyush");

	} 

}
 

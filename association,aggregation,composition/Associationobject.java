package associationaggregationcomposition;
//Association is relation between two separate classes which establishes through their Objects
//In Object-Oriented programming, an Object communicates to other Object to use functionality and services provided by that object.
class A
{ private String name;
	A(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		System.out.println("In class A name is: "+ this.name);
		return this.name;
	}
}
class B
{ private String name;
	B(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		System.out.println("In class B name is: "+ this.name);
		return this.name;
	}
}

public class Associationobject {

	public static void main(String[] args) {
	A a=new A("Piyush");
	B b=new B("khushi");
System.out.println("In class C "+ a.getname() + " And " + b.getname()); //asociation takes place between objects
	}

}

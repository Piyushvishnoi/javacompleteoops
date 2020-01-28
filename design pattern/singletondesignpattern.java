package designpatterninjava;
//eager initialization
//for singleton class,we have to do three things:
//1:create static instance of that class
//2:don't allow user to create instance for a class using constructor,i.e
//we can make default constructor as private
//3:make a static method which will return that static object 
public class singletondesignpattern {

	public static void main(String[] args) {
  A obj1=A.getinstance();   //here we are using same instance that we have created in same class
  A obj2=A.getinstance();

	}

}
class A
{
	static A obj=new A(); //creation of static object i.e static instance of class
	private A(). //making default constructor as private
	{
		System.out.println("In class A default private constructor");
	}
	public static A getinstance()
	{
		System.out.println("In get instance function and returning instance");
		return obj;
	}
}

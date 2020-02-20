package javalabexp;
import java.util.Scanner;
interface A
{
	void method1();
	void method2();
}
class MyClass implements A
{
	public void method1()
	{
	System.out.println("method 1 defines addition function");
Scanner s=new Scanner(System.in);
System.out.println("Enter two numbers a and b for addition:");
Integer a=s.nextInt();
Integer b=s.nextInt();
Integer sum=a+b;
System.out.println("Sum is:"+sum);
	}
	public void method2()
	{
		System.out.println("method 1 defines subtraction function");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers a and b for subtraction:");
		Integer a=s.nextInt();
		Integer b=s.nextInt();
		Integer subtraction=a-b;
		System.out.println("Subtraction is:"+subtraction);	
	}
}
public class exp5que2 {

	public static void main(String[] args) {
		MyClass obj=new MyClass();
		obj.method1();
		obj.method2();

	}

}

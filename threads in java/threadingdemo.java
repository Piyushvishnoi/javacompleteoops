package thread;
class Hi extends Thread // using extending thread method
{
	public void run()
	{
	for(Integer i=0;i<3;i++)
	{
	System.out.println("Hi");	
	}
	}
}
class hello extends Thread
{
	public void run()
	{
	for(Integer i=0;i<3;i++)
	{
	System.out.println("Hello");	
	}
	}
}
public class threadingdemo {
	public static void main(String[] args)
	{
		
Hi obj1=new Hi();
hello obj2=new hello();
obj1.start();

obj2.start();
	}
}

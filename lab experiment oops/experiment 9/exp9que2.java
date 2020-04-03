package javalabexp;
class even extends Thread
{
	public void run()
	{
	for(Integer i=1;i<10;i++)
	{
	if(i%2==0)
	{
		System.out.println(i+"is even");
	}
	}
	}
}
class odd extends Thread
{
	public void run()
	{
	for(Integer i=1;i<10;i++)
	{
		if(i%2!=0)
		{
			System.out.println(i+"is odd");
		}	
	}
	}
}
class experiment9  {
	experiment9() throws InterruptedException 
	{
		even obj1=new even();
odd obj2=new odd();
obj1.start();
obj1.join();
obj2.start();
obj2.join();
	}
}
public class exp9que2 {

	public static void main(String[] args) throws InterruptedException {
		experiment9 obj=new experiment9();

	}

}

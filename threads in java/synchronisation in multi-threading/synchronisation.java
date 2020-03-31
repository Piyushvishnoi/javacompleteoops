package thread;
class Counter1 
{ Integer count=0;
	public  synchronized void increament()
	{
			count++;
	}
}
public class synchronisation {

	public static void main(String[] args) throws Exception {
		Counter1 c=new Counter1();
		//Runnable obj1=new Runnable();
		Thread t1=new Thread(new Runnable()
				{
				public void run()
				{
			for(Integer i=0;i<1000;i++)
			{
				c.increament();
			}
				}
				});
		Thread t2=new Thread(new Runnable()
		{
		public void run()
		{
	for(Integer i=0;i<1000;i++)
	{
		c.increament();
	}
		}
		});
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		System.out.println(c.count);
	}

}

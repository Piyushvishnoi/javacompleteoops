package javalabexp;
//Synchronisation will help in case when one thread will try to interfere in another thread's executioon
class Counter1 
{ Integer count=0;
	public  synchronized void increament()
	{
			count++;
	}
}
public class exp9que3 {

	public static void main(String[] args) throws Exception {
		Counter1 c=new Counter1();
		//Runnable obj1=new Runnable();
		Thread t1=new Thread(new Runnable()   //implementing runnable for thread 1
				{
		
				public void run()
				{
					
			for(Integer i=0;i<1000;i++)
			{
				c.increament();
			}
			
				}
				});
		Thread t2=new Thread(new Runnable()   //implementing runnable for thread 2
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
		t1.setName("Thread1");
		System.out.println(t1.getName());
		t1.join();
		t2.start();
		t1.setName("Thread2");
		System.out.println(t1.getName());
		t2.join();
		System.out.println(c.count);
	}

}


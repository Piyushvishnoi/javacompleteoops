package thread;
//Synchronisation will take care that one thread will not interfere in the processing of another thread 
class Counter1 
{ Integer count=0;
	public  synchronized void increament()        //synchronization takes place among two threads
	{
			count++;
	}
}
public class synchronisation {

	public static void main(String[] args) throws Exception {
		Counter1 c=new Counter1();
		//Runnable obj1=new Runnable();
		Thread t1=new Thread(new Runnable()      //thread 1 implementing runnable interface
				{
				public void run()
				{
					System.out.println(Thread.getName());   //getting name of the thread
			for(Integer i=0;i<1000;i++)
			{
				c.increament();
			}
				}
				});
		Thread t2=new Thread(new Runnable()     //  thread 2 implementing runnable interface
		{
		public void run()
		{
			System.out.println(Thread.getName());     //getting name of the thread
	for(Integer i=0;i<1000;i++)
	{
		c.increament();
	}
		}
		});
		t1.start();       //starting first thread
		t1.join();
		t2.start();    //starting second thread
		t2.join();
		System.out.println(c.count);
	}

}

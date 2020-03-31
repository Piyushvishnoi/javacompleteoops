package thread;
class counter 
{ Integer count=0;
	public  void increament()
	{
			count++;
	}
}
public class Synchronisationinthreading {

	public static void main(String[] args) throws Exception {
		counter c=new counter();
		//Runnable obj1=new Runnable();
		Thread t1=new Thread(new Runnable()      //implementing runnable interface
				{
				public void run()      //defining run function
				{
			for(Integer i=0;i<1000;i++)
			{
				c.increament();
			}
				}
				});
		t1.start();           //starting the thread
		t1.join();            //joining the thread into main thread
		System.out.println(c.count);
	}

}

package thread;
public class Joinandisaliveinthread {

	public static void main(String[] args) {
		Runnable obj1=() ->
		{
			for(Integer i=0;i<3;i++)
			{
			System.out.println("Hi");	
		try { Thread.sleep(1000);} catch(Exception e) {}
			}
			}
	;
	Runnable obj2=() ->      // since runnable is a functional interface so we can use lambda expression
		{
		for(Integer i=0;i<3;i++)
		{
		System.out.println("Hello");	
		try { Thread.sleep(1000);} catch(Exception e) {}
		}
		}
			;
			Thread t1=new Thread(obj1);
			Thread t2=new Thread(obj2);
			t1.start();
			try { Thread.sleep(10);} catch(Exception e) {}
			t2.start();
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(t2.isAlive());
			try {
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(t1.isAlive());
			System.out.println("in main thread");
	}
}


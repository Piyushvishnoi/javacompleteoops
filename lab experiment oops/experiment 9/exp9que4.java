package javalabexp;
//Priority for thread execution 
//1- min priority
//5- default priority
//10- highest priority
class que4 implements Runnable
{
	public synchronized void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("Threading is done"+Thread.currentThread().getPriority());
	}
}
public class exp9que4 {

	public static void main(String[] args) throws InterruptedException {
		que4 m=new que4();
		Thread t1=new Thread(m);
		Thread t2=new Thread(m);
		Thread t3=new Thread(m);
		Thread t4=new Thread(m);
		Thread t5=new Thread(m);
	t1.start();
	t1.setPriority(5);  //setting priority
	t2.start();
	t2.setPriority(10);
	t3.start();
	t3.setPriority(2);
	t4.start();
	t4.setPriority(3);
	t5.start();
	t5.setPriority(8);
/* t1.setPriority(5);
t2.setPriority(10);
t3.setPriority(2);
t4.setPriority(3);
t5.setPriority(8); */
System.out.println(t1.isAlive()); // checking whether the thread is alive or not
System.out.println(t2.isAlive());
	}

}

package thread;
class multi implements Runnable
{
	public void run()
	{
		System.out.println("Threading is done");
	}
}
public class threadingusingrunnableinterface {

	public static void main(String[] args) {
	multi m=new multi();
	Thread t1=new Thread(m);
t1.start();
	}

}

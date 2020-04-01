package thread;
//start() method of Thread class is used to start a newly created thread
//Runnable interface have only one method named run()
class multi implements Runnable
{
	public void run()  //implementing run method
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

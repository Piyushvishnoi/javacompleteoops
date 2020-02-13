package javalabexp;
import java.util.Scanner;
class superque1
{
	private static int var1;
	public static int var2;
	superque1()
	{
	Scanner s=new Scanner(System.in);
	var1=s.nextInt();
	var2=s.nextInt();
	}
	private void add()
	{
		Integer sum=var1+var2;
		System.out.println(sum);
	}
	public void greater()
	{
		if(var1>var2)
		{
			System.out.println(var1 + "is greater");
		}
		else if(var2>var1)
		{
			System.out.println(var2 + "is greater");
		}
		else
		{
			System.out.println("both are equal");
		}
	}
}
public class que1 extends superque1 {

	public static void main(String[] args) {
		que1 obj=new que1();
	//	System.out.println(var1);  //var1 will not be accessible directly
System.out.println(obj.var2);
obj.greater(); //calling greater function
//obj.add(); cannot call private function directly
	}

}

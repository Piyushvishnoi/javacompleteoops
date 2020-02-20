package javalabexp;
import java.util.Scanner;
interface demo
{
	Scanner s=new Scanner(System.in);
	Integer number=s.nextInt();
	 void functions();
}
class myclass1 implements demo {
public void functions()
{
	//number++; will show error
	Integer square=number*number;
	System.out.println("Square is: "+ square);
}
}
public class exp5que3 implements demo {
public void functions()
{
	System.out.println("Enter number upto which we want to compare:");
	Scanner s=new Scanner(System.in);
	Integer no=s.nextInt();
	//number++; will show error
	System.out.println("Sum is"+number+no);
}

	public static void main(String[] args) {
		
myclass1 obj=new myclass1();
obj.functions();
//functions();
	}
}

package javalabexp;
import java.util.Scanner;
interface test{
	void square(Integer number);
}
class arithmetic implements test
{ public Integer number;
	 public void square(Integer number)
	{
		System.out.println("Square of number is: "+number*number);
	}
}
class totestint
{
	arithmetic obj=new arithmetic();
	totestint()
	{ 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number: ");
	Integer no=s.nextInt();
	
	obj.square(no);
	}
}
public class exp5que1 {

	public static void main(String[] args) {
		totestint obj1=new totestint();
	

	}

}

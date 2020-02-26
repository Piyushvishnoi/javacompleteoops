package javalabexp;
import java.util.Scanner;
interface test{    //defining interface
	void square(Integer number);    //method is by default abstract 
}
class arithmetic implements test     //implementing interface
{ public Integer number;
	 public void square(Integer number)    //defining abstract method
	{
		System.out.println("Square of number is: "+number*number);
	}
}
class totestint   //totestint class has-A relationship with arithmetic class
{
	arithmetic obj=new arithmetic();
	totestint()    //defining constructor
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

package javalabexp;
import java.util.Scanner;
class demoexception
{Integer a,b;
	void dividefunction()
	{
		System.out.println("Enter two numbers: ");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		try {.  //here it will throw exception 
			int result=a/b;
				
		}
		catch(ArithmeticException e){.  //here we get answers to our exception
			System.out.println("no to be divided with must be zero");
		}
		
		
	}
}
public class exp7que2 {

	public static void main(String[] args) {
		
demoexception obj=new demoexception();
obj.dividefunction();
	}

}

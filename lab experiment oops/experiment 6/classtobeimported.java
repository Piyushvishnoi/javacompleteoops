package exp6package;
import java.util.Scanner;
public class classtobeimported {   //defining class
	public Integer a,b;
	protected String member;
	public classtobeimported()  //defining constructor
	{
		System.out.println("Enter value of a,b,c: ");
		Scanner s=new Scanner(System.in);   //making object for scanner class
		a=s.nextInt();
		b=s.nextInt();
		s.nextLine();
		member=s.nextLine();
	}
 void sumfunc()
{
	System.out.println("Sum is: "+a+b);
}
}

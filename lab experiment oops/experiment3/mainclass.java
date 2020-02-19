package javalabexp;
import java.util.Scanner;
class worker
{ public String name;
  public Integer salaryrate;
	worker()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name:");
		name=s.nextLine();
		System.out.println("Enter salaryrate:");
		salaryrate=s.nextInt();
	}
void compay(Integer hrs)
{
	Integer salary=hrs*salaryrate;
	System.out.println("Slary is:" + salary);
	}
}
class dailyworker extends worker
{
	dailyworker()
	{
		System.out.println("Daily workers will be paid according to 40 hours a week");
	}
}
class salariedworker extends worker
{
	salariedworker()
	{
		System.out.println("Salaried worker will be paid according to no of days he/she works");	
	}
}
public class mainclass {

	public static void main(String[] args) {
		worker w;
		w=new dailyworker();
		w.compay(40);
				w=new salariedworker();
				System.out.println("Enter no of days salaried worker worked: ");
				Scanner s=new Scanner(System.in);
				Integer days=s.nextInt();
				w.compay(days);

	}

}

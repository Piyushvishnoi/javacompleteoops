package javalabexp;
import java.util.Scanner;
class trunkcall
{ public Integer duration;
public Integer charges;
	trunkcall()
	{
		System.out.println("Enter Duration of call: ");
		Scanner s=new Scanner(System.in);
		duration= s.nextInt();
	}
	void charges(int rate) {
		charges=duration*rate;
		System.out.println("Charges are: " +charges);
	}
}
class ordinarytrunkcall extends trunkcall
{ public Integer rateofordinary;
	ordinarytrunkcall()
	{
		System.out.println("Enter rate of ordinary trunk call as per hour: ");
		Scanner s=new Scanner(System.in);
	rateofordinary=s.nextInt();
	charges(rateofordinary);
	}
}
class urgenttrunkcall extends trunkcall
{ public Integer rateofurgent;
	urgenttrunkcall()
	{
		System.out.println("Enter rate of ordinary trunk call as per hour: ");
		Scanner s=new Scanner(System.in);
	rateofurgent=s.nextInt();
	charges(rateofurgent);
	}
}
public class ques4 {

	public static void main(String[] args) {
		trunkcall obj;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your type: 1: Ordinary trunk call"
				+ " 2: urgent trunk call");
		Integer i=s.nextInt();
		
				
		switch(i)
		{
		case 1:
			System.out.println("It was an Ordinary trunk call");
			obj=new ordinarytrunkcall();
			break;
		case 2:
			System.out.println("It was an urgent trunk call");
			obj=new urgenttrunkcall();
			break;
		default:
			System.out.println("It was not a trunk call");
		}

	}

}

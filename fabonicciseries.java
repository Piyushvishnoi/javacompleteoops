package labexperiment4thsem;
import java.util.Scanner;
public class fabonicciseries {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter two starting no");
	Integer no1=s.nextInt();
	Integer no2=s.nextInt();
	System.out.println("Enter the no upto which we want to print fabonicci series");
	Integer no=s.nextInt();
	System.out.println(no1);
	System.out.println(no2);
	for(Integer i=1;i<no;i++)
	{
		Integer c=no1+no2;
		System.out.println(c);
		no1=no2;
		no2=c;
	}
	

	}

}

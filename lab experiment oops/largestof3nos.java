// to find largest of three nos
package labexperiment4thsem;
import java.util.Scanner;
public class largestof3nos {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in); //input through scanner
	Integer no1=s.nextInt();  //input of numbers
	Integer no2=s.nextInt();
	Integer no3=s.nextInt();
	if(no1>no2)
	{
		if(no1>no3)
			System.out.println(no1 + " is largest");
		else
			System.out.println(no3 + "is largest");
	}
	else
	{
		if(no2>no3)
			System.out.println(no2 + " is largest");
		else
			System.out.println(no3 + "is largest");
	}
	s.close();
	}

}

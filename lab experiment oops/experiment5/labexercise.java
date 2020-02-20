package javalabexp;
import java.util.Scanner;

class demo1
{
	public static String name;
	public static Integer count=0;
	demo1()
	{
		Scanner s=new Scanner(System.in);
	System.out.println("Enter name: ");
		name=s.nextLine();
		}
	static Integer toreturncount()
	{ count++;
		return count;
	}
	static String gender()
	{ System.out.println("Enter gender:1: male 2:female");
	Scanner s=new Scanner(System.in);
	String g=s.nextLine();
	if(g=="male")
		return "Mr";
	else
		return "Mrs";
	}
	static String shortname()
	{ int c=toreturncount();
		String s=" ";
	String[] arr=new String[10];
	for(int i=0;i<name.length();i++)
		 arr=name.split(" ");
		for(int i=0;i<arr.length-1;i++)
		{
			 s=s+arr[i].charAt(0);
		}
		return ("c"+s+arr[arr.length]);
	}
}
public class labexercise  {

	public static void main(String[] args) {
		demo1 obj=new demo1();
		String s=demo1.shortname();
		String s1=demo1.gender();
System.out.println("Welcome sir you are the " + s);
	}

}

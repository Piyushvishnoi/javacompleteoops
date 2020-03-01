package javalabexp;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Scanner;
class exp7
{
	String[] name=new String[5];
	Integer[] rollno=new Integer[5];
}

public class exp7que1  {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		exp7 obj=new exp7();
		for(int i=0;i<obj.name.length;i++)
		{
			try {               //identification of error in try block
				Scanner s=new Scanner(System.in);
				obj.name[i]=s.nextLine();
			}
		
		catch(ArrayIndexOutOfBoundsException e).  //catching the errors 
		{
			System.out.println("index is exceeding");
		}
		}
	}

}

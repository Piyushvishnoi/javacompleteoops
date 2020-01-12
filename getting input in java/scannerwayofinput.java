package waysofinputinjava;
import java.util.Scanner;  //scanner way of getting input
public class scannerwayofinput {

	public static void main(String[] args) {
Scanner obj=new Scanner(System.in);
String name=obj.nextLine();
System.out.println("you entered string" + name);
int number=obj.nextInt();
System.out.println("you entered no as:" + number);
float no=obj.nextFloat();
System.out.println("you entered float no as: " + no);
obj.close();  //resources must be closed after usage
}

}

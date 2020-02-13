package javalabexp;
import java.util.Scanner;
class player
{  protected String name;
private Integer fees;
	player()
	{
		System.out.println("Enter name");
		Scanner s=new Scanner(System.in);
		name=s.nextLine();
	}
	void functionforfees()
	{
		System.out.println("Enter fees to be deposited");
		Scanner s=new Scanner(System.in);
		fees=s.nextInt();
	}
}
class hockeyplayer extends player
{
	void needofmaterial()
	{
	System.out.println("need of hockey bat");
	}
}
class cricketplayer extends player
{
	void needofmaterial()
	{
	System.out.println("need of cricket bat,pad,glubs");
	}
}
class footballplayer extends player
{
	void needofmaterial()
	{
	System.out.println("need of football and boots");
	}
}
public class que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
hockeyplayer obj=new hockeyplayer();
obj.needofmaterial();
cricketplayer obj1=new cricketplayer();
obj1.needofmaterial();
	}

}

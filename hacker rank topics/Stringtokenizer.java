import java.util.StringTokenizer;
//
public class Stringtokenizer {

	public static void main(String[] args) {
		//here we have used delimiter as space by default
	StringTokenizer obj=new StringTokenizer("My name is Piyush Vishnoi");
	while(obj.hasMoreTokens())
	{
		System.out.println(obj.nextToken());
	}
	//here we have another symbol as delimiter
	StringTokenizer obj1=new StringTokenizer("My name:is Piyush: Vishnoi",":");
	while(obj1.hasMoreTokens())
	{
		System.out.println(obj1.nextToken());
	}
	}

}

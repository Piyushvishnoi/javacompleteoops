package indexoftypes;
import java.util.Scanner;
public class toidentifyvowel {

	public static boolean vowel(char ch)
	{
		return "aeiouAEIOU".indexOf(ch)>=0;   //return something if present in aeiou
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Character: ");
		char singlechar=s.next().charAt(0);
		
		boolean isvowel=vowel(singlechar);
		if(isvowel)
			System.out.println("vowel");
		else
		{
			System.out.println("constant");
		}

	}

}

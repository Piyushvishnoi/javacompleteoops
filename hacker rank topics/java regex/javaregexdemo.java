package hackerranktopics;
//The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings. regex means regular expression which we used in our daily progamming concepts
//many ways to implement regex
import java.util.regex.*;

public class javaregexdemo {

	public static void main(String[] args) {
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("As");
		boolean b=m.matches();
		System.out.println(b);
		//2nd way
		boolean b1=Pattern.compile(".s").matcher("Ps").matches();
 System.out.println(b1);
  //3rd way
 boolean b2=Pattern.matches(".s","PP");
 System.out.println(b2);

	}

}

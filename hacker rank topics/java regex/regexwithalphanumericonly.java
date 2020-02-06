package hackerranktopics;
//a pattern have to be followed
import java.util.regex.Pattern;

public class regexwithalphanumericonly {

	public static void main(String[] args) {
	System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","abcA56")); //a pattern is followed
	System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","abcA5$"));

	}

}

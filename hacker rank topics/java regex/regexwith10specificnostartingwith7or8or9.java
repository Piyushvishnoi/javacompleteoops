package hackerranktopics;

import java.util.regex.Pattern;

public class regexwith10specificnostartingwith7or8or9 {

	public static void main(String[] args) {
		//start only with 7or8or9
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}","7654321908"));
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}","3654321908"));

	}

}

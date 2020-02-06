package hackerranktopics;

import java.util.regex.Pattern;

public class regexusageofsomesymbols {

	public static void main(String[] args) {
	System.out.println(Pattern.matches("[amn]?","a"));
	System.out.println(Pattern.matches("[amn]?","am"));
	System.out.println(Pattern.matches("[amn]?",""));
	System.out.println(Pattern.matches("[amn]+","a"));
	System.out.println(Pattern.matches("[amn]+","aammn"));
	System.out.println(Pattern.matches("[amn]+",""));
	System.out.println(Pattern.matches("[amn]*","aa"));
	}

}

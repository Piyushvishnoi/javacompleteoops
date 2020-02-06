package hackerranktopics;

import java.util.regex.Pattern;

public class regexusageofsomesymbols {

	public static void main(String[] args) {
	System.out.println(Pattern.matches("[amn]?","a")); //true (a or m or n comes one time) 
	System.out.println(Pattern.matches("[amn]?","am"));
	System.out.println(Pattern.matches("[amn]?",""));
	System.out.println(Pattern.matches("[amn]+","a"));//true (a or m or n once or more times) 
	System.out.println(Pattern.matches("[amn]+","aammn"));
	System.out.println(Pattern.matches("[amn]+",""));
	System.out.println(Pattern.matches("[amn]*","aa"));//true (a or m or n may come zero or more times)
	}

}

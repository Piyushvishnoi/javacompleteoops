package javalabexp;

public class exp8que1 {

	public static void main(String[] args) {
		String s="I am Piyush Vishnoi. I am currently persuing my Btech degree from Upes,dehradun.";
		//for a single character
		//indexof gives first occurenece 
		//lastIndexof gives lastindex occurence
		//indexOf with an index no will give the occurence after certain index no
		System.out.println("First index at which m occurs:"+s.indexOf("m"));
		System.out.println("last index at which m occurs:"+s.lastIndexOf("m"));
		System.out.println("First index at which m occurs after some index:"+s.indexOf("m",5));
//for a substring
		String sub="am";
		System.out.println("First index at which " + sub + " occurs:"+s.indexOf(sub));
		System.out.println("last index at which "+sub+ " occurs:"+s.lastIndexOf(sub));
		System.out.println("First index at which " +sub+ " occurs after some index:"+s.indexOf(sub,5));	
	}

}

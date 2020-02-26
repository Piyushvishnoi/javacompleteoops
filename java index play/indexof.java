package indexoftypes;

public class indexof {

	public static void main(String[] args) {
		String s="It is very goodish types";
		System.out.println(s.indexOf("i"));  //tell that value of i is present at which index
		System.out.println(s.indexOf("i",4));  //start searching from the fourth position to search the i element
		System.out.println(s.indexOf("good"));  //to find a substring in the string
		System.out.println(s.indexOf("type")); //from where to start searching a particular substring
	}

}

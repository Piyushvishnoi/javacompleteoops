package javalabexp;

public class exp8que5 {

	public static void main(String[] args) {
		//Integer to int
		Integer num=new Integer(20);
		System.out.println(num.intValue());
		//int to String
		int c = 1234; 
	    String str3 = String.valueOf(c); 
	    System.out.println("String str3 = " + str3); 
	    String str="123";
		int inum = 100;

		/* converting the string to an int value
		 * ,the value of inum2 would be 123 after
		 * conversion
		 */
		int inum2 = Integer.parseInt(str);
			
		int sum = inum+inum2;
		System.out.println("Result is: "+sum);

	}

}

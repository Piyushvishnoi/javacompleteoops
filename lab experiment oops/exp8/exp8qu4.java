package javalabexp;

public class exp8qu4 {

	public static void main(String[] args) {
		Integer count=0;
		String s=new String("Appu Armania");
		System.out.println("length of name is: "+s.length());   //using length pre-defined method
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)=='a' && s.charAt(i)=='a')     //checking condition
		{
			count++;
			System.out.println("element a is found at: "+i+ " position");	
		}
		}
		System.out.println("element a is found "+count+ " times");
	}

}

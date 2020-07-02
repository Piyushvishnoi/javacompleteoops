package labexperiment4thsem;

public class commandlinecalculator {

	public static void main(String[] args) throws Exception {
		Integer no1=Integer.parseInt(args[0]);  
		String operator=args[1];
		Integer no2=Integer.parseInt(args[2]);
		Integer op=0;
		if(operator.contentEquals("+"))   //content equals is used to equate any character 
			op=no1+no2;
		if(operator.contentEquals("*")) 
			op=no1*no2;
		if(operator.contentEquals("-"))
			op=no1-no2;
		if(operator.contentEquals("/"))
			op=no1/no2;
		System.out.println("answer of " + operator + ": " + op);
	}

}

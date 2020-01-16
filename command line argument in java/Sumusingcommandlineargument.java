package labexperiment4thsem;

public class Sumusingcommandlineargument {

	public static void main(String[] args) {
 		int no1=0;
 		int no2=0;
 		try {
            // Parse the string argument into an integer value.
            no1 = Integer.parseInt(args[0]);
            no2=Integer.parseInt(args[1]);
        }
        catch (NumberFormatException nfe) {
            // The first argument isn't a valid integer.  Print
            // an error message, then exit with an error code.
            System.out.println("The first argument must be an integer.");
            System.exit(1);
        }
 		Integer sum=no1+no2;
 		System.out.println("Sum is :" + sum);
 		

	}

}

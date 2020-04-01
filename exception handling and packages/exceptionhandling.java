package p1;

public class exceptionhandling {

	public static void main(String[] args) {
try  //exception part will be in this try block
{
	int i=2;
	int j=0;
	int k=i/j;
}
catch(Exception e)   //catch is used to handle that exception which is found in try block
{
	System.out.println("error");
}
finally
{
	System.out.println("try catch executed");
}

	}

}

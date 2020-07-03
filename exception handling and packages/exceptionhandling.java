//exception handling
package p1;

public class exceptionhandling {

	public static void main(String[] args) {
try  //exception part will be in this try block
{
	int i=2;
	int j=0;
	int k=i/j;
}
catch(Exception e)   //catch is used to handle that exception which is found in try block //here we can even use arithmetic exception
{
	System.out.println("error");
}
finally //this will execute either exception occurs or not
{
	System.out.println("try catch executed");
}

	}

}

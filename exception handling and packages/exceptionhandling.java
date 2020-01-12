package p1;

public class exceptionhandling {

	public static void main(String[] args) {
try
{
	int i=2;
	int j=0;
	int k=i/j;
}
catch(Exception e)
{
	System.out.println("error");
}
finally
{
	System.out.println("try catch executed");
}

	}

}

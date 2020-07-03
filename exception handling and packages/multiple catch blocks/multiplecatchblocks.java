package exception;

public class multiplecatchblocks {

	public static void main(String arg[])
	{
		try {
			int b[]=null;
			
			Integer i=0;
			Integer j=1;
			Integer k=j/i;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index out of bound");
		}
		catch(Exception e)
		{
			System.err.println("Something is wrong"); //err is for red colour print on output window
		}
	}
}

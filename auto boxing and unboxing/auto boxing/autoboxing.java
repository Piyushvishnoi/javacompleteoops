package autoboxingunboxing;

public class autoboxing {

	public static void main(String[] args) {
		Integer i=2;
		Integer j=new Integer(2);
		if(i==j)
		{
			System.out.println("Same");
		}
		
		else
		{
			System.out.println("not Same");
		}
		Integer k=3;
		Integer l=3;
		if(k==l)
		{
			System.out.println("Same");
		}
		
		else
		{
			System.out.println("not Same");
		}
		Integer m=300;
		Integer n=300;
		if(m==n)
		{
			System.out.println("Same");
		}
		
		else
		{
			System.out.println("not Same");
		}
	}

}

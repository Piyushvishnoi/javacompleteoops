package autoboxingunboxing;

public class autoboxing {

	public static void main(String[] args) {
		Integer i=2; 
		Integer j=new Integer(2); 
		if(i==j)    //here address refered are different in both type of declaration of i and j
		{
			System.out.println("Same");
		}
		
		else
		{
			System.out.println("not Same");
		}
		Integer k=3;
		Integer l=3;
		if(k==l)   //here if value is between -128 to 127 then the address assigned to both will be same
		{
			System.out.println("Same");
		}
		
		else
		{
			System.out.println("not Same");
		}
		Integer m=300;
		Integer n=300;
		if(m==n)    ///Since value is above 127 , hence value of x and y are not same
		{
			System.out.println("Same");
		}
		
		else
		{
			System.out.println("not Same");
		}
	}

}

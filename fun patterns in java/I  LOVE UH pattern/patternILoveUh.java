
public class patternILoveUh {

	public static void main(String[] args) {
		final String message="I Love My Friends";
		final int n=8;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=4*n;j++)
			{
				//using math operator
				double d1=Math.sqrt(Math.pow(i-n, 2)+Math.pow(j-n, 2));
				double d2=Math.sqrt(Math.pow(i-n, 2)+Math.pow(j-3 * n, 2));
				if(d1< n +0.5 || d2<n+0.5) {
					System.out.print('*');}
				else {
					System.out.print(' ');}
			}
			System.out.print(System.lineSeparator());
		}
		for(int i=0;i<2*n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(' ');
			}
		
		for(int j=1;j<4*n+1-2*i;j++)
		{
			if(i>=2 && i<=4)
			{
				int idx=j-(4*n-2*i-message.length())/2;
				if(idx<message.length() && idx>=0) {
					if(i==3)
					{
						System.out.print(message.charAt(idx));
					}
					else {
						System.out.print(' ');
					}
				}
				else
				{
					System.out.print('*');
				}
			}
			else {
				System.out.print('*');
			}
		}
		System.out.print(System.lineSeparator());   //using line seperator method

	}
	}
}

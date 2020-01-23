package labexperiment4thsem;

import java.util.Scanner;

public class exp7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Integer[] num=new Integer[3];
		System.out.println("Enter three digits");
		for(Integer i=0;i<3;i++)
		{
			num[i]=s.nextInt();
		}
		System.out.println("all patterns possible:");
		for(Integer i=0;i<3;i++)
		{
			for(Integer j=0;j<3;j++)
			{
				for(Integer k=0;k<3;k++)
				{
					if(i!=j && j!=k && k!=i)
					{
						System.out.println(num[i] + "" + num[j] + "" + num[k]);
					}
				}
			}
		}
	}

}

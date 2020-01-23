package labexperiment4thsem;

import java.util.Arrays;
import java.util.Scanner;

public class exp6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Integer[] marks=new Integer[10];
		String[] grades=new String[10];
		System.out.println("Enter marks for 10 students:");
		for(Integer i=0;i<10;i++)
		{
			marks[i]=s.nextInt();
		}
		for(Integer i=0;i<10;i++)
		{
			Arrays.sort(marks);
		}
		System.out.println("Sorted marks are:");
		for(Integer i=0;i<10;i++)
		{
			System.out.println(marks[i]);
		}
			
		for(Integer i=0;i<10;i++)
		{
			if(marks[i]>=40 && marks[i]<=50)
			{
				grades[i]="PASS";
				System.out.println("Grades for marks " + marks[i]+" are: " + grades[i]);
			}
			else if(marks[i]>=51 && marks[i]<=75)
			{
				grades[i]="MERIT";
				System.out.println("Grades for marks " + marks[i]+" are: " + grades[i]);
			}
			else if(marks[i]>75)
			{
				grades[i]="DISTINCTION";
				System.out.println("Grades for marks " + marks[i]+" are: " + grades[i]);
			}
			else if(marks[i]<40)
			{
				grades[i]="Fail";
				System.out.println("Grades for marks " + marks[i]+" are: " + grades[i]);
			}
		}
		

	}

}

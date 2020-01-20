package filehandling;

import java.io.File;
import java.io.FileNotFoundException; //using this in case file not found
import java.util.Scanner;

public class readingfromafile {

	public static void main(String[] args) {
		try
		{
		File obj=new File("File1.txt");
		Scanner read=new Scanner(obj);
		while(read.hasNextLine())
		{
			String data=read.nextLine();
			System.out.println(data);
		}
		read.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("An error occured");
			e.getStackTrace();
		}
	}

}

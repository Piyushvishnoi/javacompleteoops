package filehandling; 

import java.io.FileWriter;
import java.io.IOException;

public class Writingtoafile {

	public static void main(String[] args) {
try
{
	FileWriter obj=new FileWriter("File1.txt");
	obj.write("I am mad");
	obj.close();
	System.out.println("Successfully written to a file");
}
catch(IOException e)
{
System.out.println("An error occured");
e.printStackTrace();
}

	}

}

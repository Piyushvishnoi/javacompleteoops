package filehandling;

import java.io.File;

public class deletingafile {

	public static void main(String[] args) {
		File obj=new File("File1.txt");
		if(obj.delete())
		{
			System.out.println("File got deleted with name: " + obj.getName());
		}
		else
			System.out.println("Failed to delete");
	

	}

}

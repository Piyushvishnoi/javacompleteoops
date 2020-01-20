package filehandling;
import java.io.File;
import java.io.IOException;
public class creatingfile {

	public static void main(String[] args) {
		try
		{
			File obj=new File("File1.txt");
			if(obj.createNewFile())
			{
				System.out.println("File has been created successfully" + obj.getName());
			}
			else
			{
				System.out.println("File already exists");
			}
		}
		catch(IOException e)
		{
			System.out.println("an error occured");
			e.printStackTrace();
		}

	}

}

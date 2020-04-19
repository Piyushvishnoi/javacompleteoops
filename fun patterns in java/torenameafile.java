package newpackage;

import java.io.File;

public class torenameafile {

	public static void main(String[] args) {
		File oldfile=new File("of.txt");
		File newfile=new File("nf.txt");
		if(oldfile.renameTo(newfile))
		{
			System.out.println("Rename successful");
		}
		else
		{
			System.out.println("Rename failed");
		}

	}

}

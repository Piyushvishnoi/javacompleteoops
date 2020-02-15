import java.text.SimpleDateFormat;
import java.util.Date;

public class dateformat {
	public static void main(String arg[])
	{ //takes input from the system date
		Date d=new Date();
		SimpleDateFormat obj=new SimpleDateFormat("dd/mm/yy HH:mm:ss");
		String date=obj.format(d);
		System.out.println(date);
		SimpleDateFormat obj1=new SimpleDateFormat("dd MMMM yyyy zzzz");
		String date1=obj1.format(d);
		System.out.println(date1);
		
	}

}

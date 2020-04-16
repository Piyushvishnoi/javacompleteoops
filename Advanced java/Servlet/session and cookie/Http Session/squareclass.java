package newpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class squareclass extends HttpServlet {
	public  void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		HttpSession session=req.getSession();
		
	int k=(int)(session.getAttribute("k"));
	 k=k*k;
	 PrintWriter obj=res.getWriter();
		obj.println("Square is: "+ k);
	
	}
}

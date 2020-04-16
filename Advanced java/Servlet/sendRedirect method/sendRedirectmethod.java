package newpackage;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class sendRedirectmethod extends HttpServlet {
public  void service(HttpServletRequest req,HttpServletResponse res) throws IOException
{
	int i=Integer.parseInt(req.getParameter("num1"));
	int j=Integer.parseInt(req.getParameter("num2"));
	int k=i+j;
	PrintWriter obj=res.getWriter();
	obj.println("Sum is: "+ k);
	res.sendRedirect("sq?k="+k);
}
}

package newpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addservelet extends HttpServlet   //extending Http Servlet
{
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException   //having request and response parameter 
{
	int i=Integer.parseInt(req.getParameter("num1"));
	int j=Integer.parseInt(req.getParameter("num2"));
	int k= i+j;
	PrintWriter obj=res.getWriter();  //PrintWriter is implemented through getWriter
	obj.println("result is: "+k);
	}
}

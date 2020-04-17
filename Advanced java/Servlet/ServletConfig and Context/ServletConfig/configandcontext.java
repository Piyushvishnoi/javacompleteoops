package newpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class configandcontext extends HttpServlet {
protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
	PrintWriter obj=res.getWriter();
	obj.print("hi");
	ServletConfig ctx=getServletConfig();  //object made for ServletConfig 
	String str=ctx.getInitParameter("name"); //used for particular Servlet
	obj.println(str);
	}
}

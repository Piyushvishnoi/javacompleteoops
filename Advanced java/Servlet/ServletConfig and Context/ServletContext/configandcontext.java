package newpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class configandcontext extends HttpServlet {
protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
	PrintWriter obj=res.getWriter();
	obj.print("hi");
	ServletContext ctx=getServletContext();
	String str=ctx.getInitParameter("name");
	obj.println(str);
	}
}

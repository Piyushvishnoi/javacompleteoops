package newpackage;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")   //annotations used instead of using web.xml configuration file 
public class annotations extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
	int i=Integer.parseInt(req.getParameter("num1"));
	int j=Integer.parseInt(req.getParameter("num2"));
	int k=i*j;
	PrintWriter out=res.getWriter();
	out.println("Result is: "+k);
	}
}

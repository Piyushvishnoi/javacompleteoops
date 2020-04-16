package newpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class squareclass extends HttpServlet {
	public  void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int k=0;
		Cookie cookies[]=req.getCookies(); //making array object of cookie because we get several cookies from client
		for(Cookie c:cookies)  //arrays are used because to choose our cookie we need this loop
		{ 
			if(c.getName().equals("k"))
			{
				k=Integer.parseInt(c.getValue());
			}
		}
	 k=k*k;
	 PrintWriter obj=res.getWriter();
		obj.println("Square is: "+ k);
	
	}
}

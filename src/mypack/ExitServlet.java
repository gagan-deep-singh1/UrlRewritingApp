package mypack;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class ExitServlet extends HttpServlet {
public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
{
	String name=request.getParameter("username");
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.println("<h3>Welcome,"+name+"</h3>");
	out.close();
}
}

package mypack;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class EntryServlet extends HttpServlet {
public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
	String name=request.getParameter("name");
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.println("<h3>Welcome,"+name+"</h3>");
	out.println("<a href=\"ExitServlet?username="+name+"\">exit</a>");
	out.close();
}
}

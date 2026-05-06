import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Servlet1 extends HttpServlet
{
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException , IOException
    {response.setContentType("text/html");
    PrintWriter pw = response.getWriter();
    String name=request.getParameter("us");
   HttpSession session = request.getSession();
   session.setAttribute("username",name);
   pw.println("<h1>session created Successfully");
   String url = response.encodeURL("Servlet2");
pw.println("<a href= '"+url+"'>Go to </a>" );
 
       
    }
}
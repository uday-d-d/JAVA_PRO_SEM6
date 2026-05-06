import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Servlet2 extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException , IOException
    {response.setContentType("text/html");
    PrintWriter pw = response.getWriter();
    
   HttpSession session = request.getSession(false);
   if(session != null)
   {
       String name = (String)session.getAttribute("username");
           pw.println("<h2>Welcome " + name + "</h2>"); 
   }
   
  
       
    }
}
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Servlet1 extends HttpServlet
{
   
        public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
        {
            response.setContentType("text/html");
            PrintWriter pw = response.getWriter();
            String name=request.getParameter("us");
            Cookie ck = new Cookie("username",name);
            response.addCookie(ck);
            pw.println("<h3> Cookie Created Successfully</h3>");
            pw.println("<a href='Servlet2'>Go to Next Servlet</a>");
        }
    }

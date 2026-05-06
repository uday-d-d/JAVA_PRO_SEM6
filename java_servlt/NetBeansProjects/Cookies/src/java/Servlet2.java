import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Servlet2 extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        Cookie[] cookies = request.getCookies();

        if (cookies != null)
        {
            for (Cookie c : cookies)
            {
                if (c.getName().equals("username"))
                {
                    pw.println("<h2>Welcome " + c.getValue() + "</h2>");
                }
            }
        }
        else
        {
            pw.println("<h2>No cookies found</h2>");
        }
    }
}
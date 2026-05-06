import javax.servlet.*;
import java.io.*;

public class Student extends GenericServlet {

    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String s1 = request.getParameter("username");
        String s2 = request.getParameter("br");
        String s3 = request.getParameter("cg");

        out.println("<html><body>");
        out.println("<h2>Name: " + s1 + "</h2>");
        out.println("<h2>Branch: " + s2 + "</h2>");
        out.println("<h2>College: " + s3 + "</h2>");
        out.println("</body></html>");
    }
}
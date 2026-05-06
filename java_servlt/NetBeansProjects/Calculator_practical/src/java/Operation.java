import javax.servlet.*;
import java.io.*;
public class Operation extends GenericServlet
{
    public void service(ServletRequest request,ServletResponse response) throws IOException , ServletException
    {response.setContentType("text/html");
    PrintWriter out =response.getWriter();
        try
        {
            int n1 = Integer.parseInt(request.getParameter("n1"));
             int n2= Integer.parseInt(request.getParameter("n2"));
             int re=0;
             String s1= request.getParameter("op");
             if(s1.equals("ADD"))
             {re=(n1+n2);
             }
             else if(s1.equals("SUB"))
             {
                 re=(n1-n2);
             }
             else if(s1.equals("DIV"))
             {re=(n1/n2);
             }
             else if(s1.equals("MUL"))
             {
                 re=(n1*n2);
             }
             out.println("<html><body>");
             out.println("<h1>Result is :" + re + "</h1>");
             out.println("</body></html>");
        }
        catch(Exception e)
        {
        }
    }
}
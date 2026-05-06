import javax.servlet.*;
import java.sql.*;
import java.io.*;
public class StudentFetch extends GenericServlet
{
    Connection conn;
    public void init(ServletConfig config) throws ServletException
    {try
    {
        String driver=config.getInitParameter("p1");
        String cs = config.getInitParameter("p2");
        String user=config.getInitParameter("p3");
        String pass=config.getInitParameter("p4");
        Class.forName(driver);
        conn=DriverManager.getConnection(cs,user,pass);
    }
    catch(Exception e)
    {
        
    }
        
    }
    
    public void service(ServletRequest request,ServletResponse response) throws ServletException
    {
        try
        {
            response.setContentType("text/html");
            PrintWriter pw=response.getWriter();
            int roll=Integer.parseInt(request.getParameter("ro"));
            PreparedStatement ps = conn.prepareStatement("select * from student1 where ROLLNO = ?");
            ps.setInt(1, roll);
            ResultSet re = ps.executeQuery();
            pw.println("<html><body>");
            if(re.next())
            {
                pw.println("<h1>"+roll+"</h1>");
                 pw.println("<h1>"+re.getString(2)+"</h1>");
                  pw.println("<h1>"+re.getString(3)+"</h1>");
                   pw.println("<h1>"+re.getDouble(4)+"</h1>");
            }
            pw.println("</body></html>");
        }
        catch(Exception e)
        {
            
        }
    }
    
}
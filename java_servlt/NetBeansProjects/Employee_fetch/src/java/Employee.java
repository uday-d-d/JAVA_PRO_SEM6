import javax.servlet.*;
import java.sql.*;
import java.io.*;
public class Employee extends GenericServlet 
{Connection conn;
    public void init(ServletConfig config) throws ServletException
    {try
    {String driver=config.getInitParameter("p1");
    String cs = config.getInitParameter("p2");
    String user = config.getInitParameter("p3");
    String pass=config.getInitParameter("p4");
        Class.forName(driver);
        conn=DriverManager.getConnection(cs,user,pass);
        
    }
    catch(Exception e)
        
    {
        
    }
    }
    public void service(ServletRequest request , ServletResponse response) throws ServletException
    {
        try
        {
           response.setContentType("text/html");
           PrintWriter out = response.getWriter();
           int id = Integer.parseInt(request.getParameter("eid"));
         PreparedStatement ps = conn.prepareStatement("select * from employee where EMP_ID=?");
         ps.setInt(1,id);
           ResultSet re = ps.executeQuery();
           out.println("<html><body>");
           out.println("<h1> Employee Data<h2>");
           if(re.next())
           {
               out.println("<h1> Emp id :" + id +"</h1>");
               out.println("<h1> Emp Name :" + re.getString(2)+"</h1>");
               out.println("<h1> Emp Salary :" + re.getDouble(3)+"</h1>");
               out.println("<h1> Emp Post :" + re.getString(4)+"</h1>");
               out.println("<h1> Emp MobNo :" + re.getDouble(5)+"</h1>");
           }
           out.println("</body></html>");
        }
        catch(Exception e)
        {
            
        }
            
    }
        
}
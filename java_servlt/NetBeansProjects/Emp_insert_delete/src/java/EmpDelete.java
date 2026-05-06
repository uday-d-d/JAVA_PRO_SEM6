import javax.servlet.*;
import java.sql.*;
import java.io.*
public class EmpDelete extends GenericServlet
{Connection conn;
    public void init(ServletConfig config)throws ServletException
    {
        try
        {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "1234");
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
            PrintWriter out=response.getWriter();
            int id = Integer.parseInt(request.getParameter("id"));
            Statement st = conn.createStatement();
            int result = st.executeUpdate("delete from employee where EMP_ID="+id);
            out.println("<html><body>");
            out.println("<h1> Record is deleted" + result+"</h1>");
            out.println("</body></html>");
            
        }
        catch(Exception e)
        {
            
        }
        }
    }
    
    
}
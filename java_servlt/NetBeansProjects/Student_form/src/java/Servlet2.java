 import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Servlet2 extends HttpServlet {

    Connection con;

    public void init() throws ServletException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "system",
                "1234"
            );

        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

      String username = request.getParameter("username");
String passwd = request.getParameter("passwd");

        try {
            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM Admin WHERE username=? AND passwd=?"
            );

            ps.setString(1, username);
            ps.setString(2, passwd);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                out.println("<h2>Login Successful</h2>");
            } else {
                out.println("<h1>"+rs.next()+"/<h2>");
                out.println("<h2>Invalid Username or Password</h2>");
            }

        } catch (Exception e) {
            out.println(e);
        }
    }

    
}
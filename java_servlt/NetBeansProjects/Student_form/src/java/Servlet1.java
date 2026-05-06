import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
public class Servlet1 extends HttpServlet
{
   Connection conn;

    public void init(ServletConfig config) throws ServletException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE",
                "system",
                "1234"
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String rollno = request.getParameter("rollno");
        String name = request.getParameter("name");
        String branch = request.getParameter("branch");
        String percentage = request.getParameter("percentage");

        try {
            PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO student1 VALUES (?, ?, ?, ?)"
            );

            ps.setString(1, rollno);
            ps.setString(2, name);
            ps.setString(3, branch);
            ps.setFloat(4, Float.parseFloat(percentage));

            int i = ps.executeUpdate();

            if (i > 0) {
                out.println("<h2>Data Inserted Successfully</h2>");
            } else {
                out.println("<h2>Insert Failed</h2>");
            }

        } catch (Exception e) {
            out.println("<h3>Error: " + e + "</h3>");
        }
    }


}
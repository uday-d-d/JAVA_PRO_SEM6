import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class EmpInsert extends GenericServlet {

    Connection con;

    public void init(ServletConfig config) throws ServletException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE",
                "system",
                "1234"
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {

        try {
            response.setContentType("text/html");
            PrintWriter pw = response.getWriter();

            int eid = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String post = request.getParameter("post");
            double sal = Double.parseDouble(request.getParameter("sal"));
            double no = Double.parseDouble(request.getParameter("no"));

            Statement st = con.createStatement();

            String query = "INSERT INTO employee VALUES (" 
                    + eid + ", '" + name + "', " + sal + ", '" + post + "', " + no + ")";

            int re = st.executeUpdate(query);

            pw.println("<html><body>");
            pw.println("<h1>Employee record inserted successfully: " + re + "</h1>");
            pw.println("</body></html>");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
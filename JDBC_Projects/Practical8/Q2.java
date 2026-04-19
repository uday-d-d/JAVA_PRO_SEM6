import java.sql.*;

public class Q2 {
    public static void main(String[] args) throws Exception{

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                "system",
                "root"
            );

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM student WHERE PERCENTAGE > 80");
            

            while (rs.next()) {
                System.out.println(rs.getInt(1) + "-" + rs.getString(2) + "-" + rs.getString(3) + "-" + rs.getDouble(4));
            }

            con.close();

}
}
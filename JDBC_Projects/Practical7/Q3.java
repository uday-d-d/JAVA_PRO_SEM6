import java.sql.*;

public class Q3 {
    public static void main(String[] args) {

        try {
            // 1. Load Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 2. Connection
            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                "system",
                "root"
            );

            // 3. Create Statement
            Statement stmt = con.createStatement();

            stmt.executeUpdate(
                    "update student set percentage = percentage + (percentage * 5 / 100) WHERE percentage > 80");

            System.out.println("Updated Successfully...");

            // 5. Close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
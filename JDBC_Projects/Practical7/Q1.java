import java.sql.*;

public class Q1 {
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

            // 4. CREATE TABLE
            stmt.executeUpdate(
                "CREATE TABLE student (" +
                "roll_no NUMBER , " +
                "name VARCHAR2(50), " +
                "branch VARCHAR2(30), " +
                "percentage NUMBER(5,2))"
            );

            System.out.println("Table Created Successfully!");

            // 5. Close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
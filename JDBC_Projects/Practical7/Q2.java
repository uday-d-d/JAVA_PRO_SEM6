import java.sql.*;

public class Q2 {
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

            // 4. INSERT 3 rows
            stmt.executeUpdate("INSERT INTO student VALUES (1, 'Balaji', 'IT', 91.00)");
            stmt.executeUpdate("INSERT INTO student VALUES (2, 'uday', 'IT', 90.00)");
            stmt.executeUpdate("INSERT INTO student VALUES (3, 'Om', 'IT', 91.00)");
            stmt.executeUpdate("INSERT INTO student VALUES (4, 'Parth', 'IT', 95.00)");
            stmt.executeUpdate("INSERT INTO student VALUES (5, 'Harshal', 'IT', 85.00)");

            

            System.out.println("Data insrted...");

            // 5. Close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
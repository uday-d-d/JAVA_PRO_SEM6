import java.sql.*;

public class Q4 {
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

            // Statement stmt = con.createStatement();

            // // 3. CREATE TABLE
            // try {
            //     stmt.executeUpdate(
            //         "CREATE TABLE emp (" +
            //         "emp_id NUMBER PRIMARY KEY, " +
            //         "emp_name VARCHAR2(50), " +
            //         "emp_salary NUMBER(10,2), " +
            //         "emp_post VARCHAR2(30), " +
            //         "mobile_no VARCHAR2(15))"
            //     );
            //     // System.out.println("Table Created!");
            // } catch (Exception e) {
            //     System.out.println("Table already exists!");
            // }

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO emp VALUES (?, ?, ?, ?, ?)"
            );

            ps.setInt(1, 1);
            ps.setString(2, "Yogi");
            ps.setDouble(3, 25000);
            ps.setString(4, "Developer");
            ps.setString(5, "9876543210");
            ps.executeUpdate();

            ps.setInt(1, 2);
            ps.setString(2, "Trushna");
            ps.setDouble(3, 30000);
            ps.setString(4, "Manager");
            ps.setString(5, "9123456780");
            ps.executeUpdate();

            ps.setInt(1, 3);
            ps.setString(2, "Soundarya");
            ps.setDouble(3, 20000);
            ps.setString(4, "Tester");
            ps.setString(5, "9988776655");
            ps.executeUpdate();

            ps.setInt(1, 4);
            ps.setString(2, "Yash");
            ps.setDouble(3, 28000);
            ps.setString(4, "Designer");
            ps.setString(5, "9012345678");
            ps.executeUpdate();

            ps.setInt(1, 5);
            ps.setString(2, "Parag");
            ps.setDouble(3, 35000);
            ps.setString(4, "HR");
            ps.setString(5, "9090909090");
            ps.executeUpdate();

            System.out.println("5 Records Inserted Successfully!");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
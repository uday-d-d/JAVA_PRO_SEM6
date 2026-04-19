import java.sql.*;

public class Q3 {
    public static void main(String[] args) throws Exception{

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/XEPDB1",
                "system",
                "root"
            );

            Statement stmt = con.createStatement();

            // // 1. CREATE TABLE
            // stmt.executeUpdate(
            //     "CREATE TABLE employee (" +
            //     "emp_id NUMBER PRIMARY KEY, " +
            //     "emp_name VARCHAR2(50), " +
            //     "emp_salary NUMBER(10,2), " +
            //     "emp_post VARCHAR2(30), " +
            //     "mobile_no VARCHAR2(15))"
            // );

            // // System.out.println("Table Created!");

            // // 2. INSERT 3 RECORDS
            // stmt.executeUpdate("INSERT INTO employee VALUES (1,'Balu',25000,'Developer','45876954')");
            // stmt.executeUpdate("INSERT INTO employee VALUES (2,'Om',30000,'Manager','45632178')");
            // stmt.executeUpdate("INSERT INTO employee VALUES (3,'Uday',20000,'Tester','456875263')");

            // // System.out.println("Records Inserted!");

            
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            
            ResultSetMetaData rsmd = rs.getMetaData();
            int colCount = rsmd.getColumnCount();

            
            for (int i = 1; i <= colCount; i++) {
                System.out.print(rsmd.getColumnName(i) + "\t");
            }
            System.out.println();

            
            while (rs.next()) {
                for (int i = 1; i <= colCount; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }

            con.close();
    }
}
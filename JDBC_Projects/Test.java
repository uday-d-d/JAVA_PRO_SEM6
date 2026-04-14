import java.sql.*;

class Test {
    public static void main(String[] args) throws Exception {

        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection con = DriverManager.getConnection(
        "jdbc:oracle:thin:@localhost:1521:XE",
        "system","root");

        System.out.println("Connection Successful!");

        con.close();
    }
}
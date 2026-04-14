import java.sql.*;

class CreateTable {
    public static void main(String args[]) throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");

        Statement stmt = con.createStatement();
        int result = stmt.executeUpdate("create table hamal(id number(3), name varchar2(10), post varchar2(10), salary float)");

        System.out.println("Table is created Successfully ! ");

        int result1 = stmt.executeUpdate("insert into labour values(1,'Ajay', 'teacher' ,30000)");

        ResultSet rs= stmt.executeQuery("select * from labour");

        while(rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String post = rs.getString(3);
            float salary = rs.getFloat(4);

            System.out.println(id + " " + name + " "+ post + " " +salary);
        }
    con.close();
    }
}

package dbbank;
import java.sql.*;
public class Account {
    private static Connection conn;
    private static Statement stmt;
    private static final String TABLENAME = "account";

    public static void connectToDB(){
        final String DBURL ="jdbc:mysql://localhost:3306/student";
        final String USERNAME ="root";
        final String PASSWORD="Ab@2002#";
        try {
            System.out.print("trying to connect to database...");
            conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            System.out.println("connection succeeded");
            stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
            stmt.execute("CREATE TABLE IF NOT EXISTS " + TABLENAME + "(accno INT PRIMARY KEY, name varchar(100), balance FLOAT)");
        } catch (SQLException ex) {
            System.err.println("Error:" +ex);
            System.exit(0);
        }
    }
    public static boolean insert(int accno, String name,float balance) throws SQLException {
        return stmt.executeUpdate("INSERT INTO " + TABLENAME + " VALUES(" + accno + ",'" + name + "'," + balance + ")") == 1;
    }
    public static boolean delete(int accno) throws SQLException {
        return stmt.executeUpdate("DELETE FROM " + TABLENAME + " WHERE accno=" + accno) == 1;
    }
    public static boolean update(int accno, String name) throws SQLException {
        return stmt.executeUpdate("UPDATE " + TABLENAME + " SET name='" + name + "' WHERE accno=" +accno) == 1;
    }
    public static void display() throws SQLException {
        ResultSet rs = stmt.executeQuery("SELECT * FROM " + TABLENAME);
        System.out.println("AccNo\tName\tBalance");
        while(rs.next())
            System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3));
            rs.close();
    }
    public static void close() throws SQLException {
        if (stmt != null) stmt.close();
        if (conn != null) conn.close();
    }  
}
package dbstudent;
import java.sql.*;
public class Student {
    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;
    private static final String TABLENAME = "student";

    public static void connectToDB(){
        try {
        final String   DBURL ="jdbc:mysql://localhost:3306/student";
        final String   USERNAME ="root";
        final String    PASSWORD="Ab@2002#";
            System.out.print("trying to connect to database...");
            conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            System.out.println("connection succeeded");
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            stmt.execute("CREATE TABLE IF NOT EXISTS " + TABLENAME + "(USN varchar(10) PRIMARY KEY, name varchar(100))");
            rs = stmt.executeQuery("SELECT * FROM " + TABLENAME);
        } catch (SQLException ex) {
            System.err.println("Error:" +ex);
            System.exit(0);
        }
    }
    public static void insert(String usn,String name) throws SQLException {
        rs.moveToInsertRow();
        rs.updateString("usn", usn);
        rs.updateString("name", name);
        rs.insertRow();
    }
    public static boolean delete(int rowNo) throws SQLException {
        if(!rs.absolute(rowNo))
            return false;
        rs.deleteRow();
        return true;
    }
    public static boolean update(int rowNo,String newUsn, String newName) throws SQLException {
        if(!rs.absolute(rowNo))
            return false;
        rs.updateString("usn", newUsn);
        rs.updateString("name", newName);
        rs.updateRow();
        return true;
    }
    public static String search(String usn) throws SQLException {
        rs.beforeFirst();
        while(rs.next())
            if(rs.getString("usn").equalsIgnoreCase(usn))
                return rs.getString("name");
        return null;
    }
    public static void display() throws SQLException {
        rs.beforeFirst();
        int rowNo = 0;
        System.out.println("Row No\tUSN\tName");
        while(rs.next())
            System.out.println((++rowNo) + "\t" + rs.getString("usn") + "\t" + rs.getString("name"));    
    }
    public static void close() throws SQLException {
        rs.close();
        if (stmt != null) stmt.close();
        if (conn != null) conn.close();
    }  
}
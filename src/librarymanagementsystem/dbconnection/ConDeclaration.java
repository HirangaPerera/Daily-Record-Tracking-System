package librarymanagementsystem.dbconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
public class ConDeclaration {
	 String DRIVER ="com.mysql.cj.jdbc.Driver";
	 String url ="jdbc:mysql://127.0.0.1:3306/sqltest";
	 String uname = "root";
	 String pass= "Nolanross123!!!";
	 public static Connection conn = null;
	 public static Statement stmt;
	 public static String name;
	 public static  PreparedStatement ps = null;
	 //static String query;
}

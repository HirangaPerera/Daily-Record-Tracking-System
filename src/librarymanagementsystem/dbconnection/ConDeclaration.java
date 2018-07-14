package librarymanagementsystem.dbconnection;
import java.sql.Connection;
public class ConDeclaration {
	 String DRIVER ="com.mysql.cj.jdbc.Driver";
	 String url ="jdbc:mysql://127.0.0.1:3306/sqltest";
	 String uname = "root";
	 String pass= "Nolanross123!!!";
	 static Connection conn = null;
}

package librarymanagementsystem.dbconnection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity extends ConDeclaration{
	
	
	public void createConnection() throws ClassNotFoundException, SQLException   {
	//ConDeclaration cd = new ConDeclaration();
	 
	Class.forName("com.mysql.cj.jdbc.Driver");
	ConDeclaration.conn = DriverManager.getConnection(url,uname,pass);
	System.out.println("Connection established");
	}
}
package librarymanagementsystem.dbconnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	public void executeConnection(String query) throws SQLException, ClassNotFoundException {
		//String query="";
		Connectivity conv = new Connectivity();
		conv.createConnection();
		Statement stmt = ConDeclaration.conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		rs.next();
		String name = rs.getString("sname");
		System.out.println(name);
		stmt.close();
		ConDeclaration.conn.close();
		}
	}
	

	

	


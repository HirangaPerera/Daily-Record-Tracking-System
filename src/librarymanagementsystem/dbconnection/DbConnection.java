package librarymanagementsystem.dbconnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	Connectivity conv;
	public DbConnection(){
		conv = new Connectivity();
		try {
			conv.createConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getData(String query) throws SQLException, ClassNotFoundException {
		//conv = new Connectivity();
		//conv.createConnection();
		ConDeclaration.stmt = ConDeclaration.conn.createStatement();
		ResultSet rs = ConDeclaration.stmt.executeQuery(query);
		rs.next();
		String name = rs.getString("sname");
		System.out.println(name);
		//ConDeclaration.stmt.close();
		//ConDeclaration.conn.close();
		}
	
	public void updateData(String query) throws ClassNotFoundException, SQLException {
		//conv = new Connectivity();
		//conv.createConnection();
		ConDeclaration.stmt = ConDeclaration.conn.createStatement();
		int count = ConDeclaration.stmt.executeUpdate(query);
		System.out.println(count+"rows affected");
		ConDeclaration.stmt.close();
		ConDeclaration.conn.close();
	}
	
	}
	

	

	


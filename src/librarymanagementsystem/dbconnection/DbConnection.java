package librarymanagementsystem.dbconnection;

import java.sql.SQLException;


public class DbConnection {
	
	//Connectivity conv;
	public DbConnection(){
		//conv = new Connectivity();
		
			//conv.createConnection();
		
		}
	
	public void getData(String query) throws SQLException, ClassNotFoundException {
		//conv = new Connectivity();
		//conv.createConnection();
		ConDeclaration.ps = ConDeclaration.conn.prepareStatement(query);
		//ConDeclaration.stmt=ConDeclaration.conn.createStatement();
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
public void createStatementm(String query) throws SQLException, ClassNotFoundException {
	//conv = new Connectivity();
	//conv.createConnection();
	//ConDeclaration.ps = ConDeclaration.conn.prepareStatement(query);
	ConDeclaration.stmt=ConDeclaration.conn.createStatement();
}
	
}	
	
	

	

	


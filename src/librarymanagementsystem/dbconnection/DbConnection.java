package librarymanagementsystem.dbconnection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DbConnection 
{
public ResultSet rs;
public DbConnection() {
}
	public void getData(String query) throws SQLException, ClassNotFoundException 
		{
			ConDeclaration.ps = ConDeclaration.conn.prepareStatement(query);
		}
	public void updateData(String query) throws ClassNotFoundException, SQLException 
		{
			ConDeclaration.stmt = ConDeclaration.conn.createStatement();
			int count = ConDeclaration.stmt.executeUpdate(query);
			System.out.println(count+"rows affected");
			ConDeclaration.stmt.close();
			ConDeclaration.conn.close();
		}
	public void createStatementm(String query) throws SQLException, ClassNotFoundException 
		{
			ConDeclaration.stmt=ConDeclaration.conn.createStatement();
			ConDeclaration.stmt.executeQuery(query);
		}
	public void ctGetData (String query) throws SQLException {
		ConDeclaration.stmt = ConDeclaration.conn.createStatement();
		rs = ConDeclaration.stmt.executeQuery(query);
	}
}	
	
	

	

	


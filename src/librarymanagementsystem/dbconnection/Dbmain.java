package librarymanagementsystem.dbconnection;
import java.sql.SQLException;
public class Dbmain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		DbConnection fg = new DbConnection();
		fg.executeConnection();
		}
	}



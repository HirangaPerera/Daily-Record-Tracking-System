package login;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import librarymanagementsystem.dbconnection.*;
public class Jjjj implements Initializable{

DbConnection dbb;
@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	// TODO Auto-generated method stub
	dbb = new DbConnection();
}
public void addacion(ActionEvent event) {
	String query ="select sname from test where rollno=1";
	try {
		dbb.executeConnection(query);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
	System.out.println("trtrt");
}
}

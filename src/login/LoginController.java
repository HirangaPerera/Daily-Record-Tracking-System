package login;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.jfoenix.controls.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import librarymanagementsystem.dbconnection.ConDeclaration;
import librarymanagementsystem.dbconnection.DbConnection;

public class LoginController implements Initializable {
	  @FXML
	    private JFXTextField unametxt;

	    @FXML
	    private JFXPasswordField upasswordtxt;

	DbConnection dbcon;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		dbcon = new DbConnection();
	}
	public void getDatafrom(ActionEvent event) {
		String query ="select sname from test where rollno=1";
		try {
			dbcon.getData(query);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateTable(ActionEvent event) {
		//String uname = unametxt.getText();
		//String pswrd = upasswordtxt.getText();
		String query = "insert into test values('5','sathila')";
		try {
			dbcon.updateData(query);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public void closeConnection(ActionEvent event) {
	try {
		ConDeclaration.stmt.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		ConDeclaration.conn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

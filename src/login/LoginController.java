package login;

import java.net.URL;
import java.sql.ResultSet;
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
	String ppname;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		dbcon = new DbConnection();
	}
	public void getDatafrom(ActionEvent event) {
	
		String query ="select * from test where sname=? and rollno=?";
		try {
			dbcon.getData(query);
			
			 ConDeclaration.ps.setString(1,unametxt.getText());
			 ConDeclaration.ps.setString(2, upasswordtxt.getText());
			ResultSet rs = ConDeclaration.ps.executeQuery();
			int count =0;
			while(rs.next()) {
				count = count+1;
			}
			if(count ==1) {
				System.out.println("Hii");
			}
			else {
				System.out.println("puii");
			}
			
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateTable(ActionEvent event) {
		String query="";
		//String query = "insert into test values('"+pswrd+"','"+uname+"')";
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

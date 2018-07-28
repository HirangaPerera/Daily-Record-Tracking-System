package addMember;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.jfoenix.controls.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import librarymanagementsystem.dbconnection.ConDeclaration;
import librarymanagementsystem.dbconnection.Connectivity;
import librarymanagementsystem.dbconnection.DbConnection;

public class AddMember implements Initializable{
	@FXML
    private JFXTextField txtemail;

    @FXML
    private JFXButton btnadd;

    @FXML
    private JFXButton btncancel;

    @FXML
    private JFXTextField txtname;

    @FXML
    private JFXTextField txtcontact;

    @FXML
    private JFXTextField txtnic;

    @FXML
    private JFXTextField txtemp;
Connectivity conv;
DbConnection dbcon;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
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
	dbcon = new DbConnection();
		
	}
	public void addMember(ActionEvent event) {
		String query ="insert into Members values(?,?,?,?,?)";
		try {
			dbcon.getData(query);
			ConDeclaration.ps.setString(1,txtnic.getText());
			ConDeclaration.ps.setString(2,txtname.getText());
			ConDeclaration.ps.setString(3,txtemp.getText());
			ConDeclaration.ps.setString(4,txtcontact.getText());
			ConDeclaration.ps.setString(5,txtemail.getText());
			int count = ConDeclaration.ps.executeUpdate();
			System.out.println(count+"rows affected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

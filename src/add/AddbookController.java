package add;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.jfoenix.controls.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import librarymanagementsystem.dbconnection.Connectivity;
import librarymanagementsystem.dbconnection.DbConnection;

public class AddbookController implements Initializable {
	 @FXML
	    private JFXTextField txtpublisher;

	    @FXML
	    private JFXButton btnadd;

	    @FXML
	    private JFXButton btncancel;

	    @FXML
	    private JFXTextField txtname;

	    @FXML
	    private JFXTextField txtisbn;

	    @FXML
	    private JFXTextField txtauther;
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
	public void addData(ActionEvent event) {
		String vname = txtname.getText();
		String query = "insert into Books values(2,'"+vname+"','Donald','Rasakinda') ";
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
	


}

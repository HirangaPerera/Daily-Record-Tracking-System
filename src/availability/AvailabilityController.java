package availability;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import librarymanagementsystem.dbconnection.Connectivity;
import librarymanagementsystem.dbconnection.DbConnection;

public class AvailabilityController implements Initializable {
		DbConnection dbc;
	  	@FXML
	    private TableView<ModelTableAvailability> tblavailability;

	  	@FXML
	    private TableColumn<ModelTableAvailability, String> clmnisbn;
	  	
	  	@FXML
	    private TableColumn<ModelTableAvailability, String> clmnbknm;
	  	 
	  	@FXML
	    private JFXTextField txtbookname;
	  	
	  	@FXML
	    private JFXTextField txtisbn;

	    @FXML
	    private JFXButton btnsearch;

	    @FXML
	    private JFXButton btnavailability;

	    @FXML
	    private Label lblavailability;
	    ObservableList<ModelTableAvailability> oblistt = FXCollections.observableArrayList();
	 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Connectivity conv = new Connectivity();
		dbc = new DbConnection();
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
	
	public void getAvailability(ActionEvent event) throws SQLException {
		String name =txtisbn.getText();
		String query ="Select Availability from Books where ISBN = '"+name+"'";
		dbc.ctGetData(query);
		String isbn;
			while(dbc.rs.next()) 
				{
					isbn=dbc.rs.getString("Availability");
					lblavailability.setText(isbn);
				}
		}
	public void availabilityList(ActionEvent e) throws SQLException {
		String name =txtbookname.getText();
		String query ="Select ISBN,Book_Name from Books where Book_Name Like'%"+name+"%'";
		dbc.ctGetData(query);
			while(dbc.rs.next()) 
				{
					oblistt.add(new ModelTableAvailability(dbc.rs.getString("ISBN"),dbc.rs.getString("Book_Name")));
				}
	
		clmnisbn.setCellValueFactory(new PropertyValueFactory<ModelTableAvailability,String>("ISBN"));
		clmnbknm.setCellValueFactory(new PropertyValueFactory<ModelTableAvailability,String>("Book_Name"));
		tblavailability.setItems(oblistt);
		}
}

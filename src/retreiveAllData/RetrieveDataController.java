package retreiveAllData;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import librarymanagementsystem.dbconnection.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class RetrieveDataController implements Initializable{
	
	 @FXML
	    private TableColumn<ModelTable, String> colmail;

	    @FXML
	    private TableView<ModelTable> tble;

	    @FXML
	    private TableColumn<ModelTable, String> colname;

	    @FXML
	    private TableColumn<ModelTable, String> colprogramme;

	    @FXML
	    private TableColumn<ModelTable, String> colid;
	    
ObservableList<ModelTable> oblist = FXCollections.observableArrayList();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Connectivity conv = new Connectivity();
		DbConnection dcon = new DbConnection();
		try {
			conv.createConnection();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			//ConDeclaration.stmt=ConDeclaration.conn.createStatement();
			String query="Select * from data";
			try {
				dcon.createStatementm(query);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ResultSet rs = ConDeclaration.stmt.executeQuery(query);
			while(rs.next()) {
				oblist.add(new ModelTable(rs.getString("ID"),rs.getString("Name"),rs.getString("Email"),rs.getString("Programme")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		colid.setCellValueFactory(new PropertyValueFactory<>("ID"));
		colname.setCellValueFactory(new PropertyValueFactory<>("Name"));
		colmail.setCellValueFactory(new PropertyValueFactory<>("Email"));
		colprogramme.setCellValueFactory(new PropertyValueFactory<>("Programme"));
		tble.setItems(oblist);



		
	}

}

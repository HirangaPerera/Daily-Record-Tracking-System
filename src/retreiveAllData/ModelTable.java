package retreiveAllData;

public class ModelTable {
String ID,Name,Email,Programme;

public ModelTable(String ID,String Name,String Email,String Programme) {
	this.ID = ID;
	this.Name = Name;
	this.Email = Email;
	this.Programme = Programme;
	
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getProgramme() {
	return Programme;
}
public void setProgramme(String programme) {
	Programme = programme;
}


}

package availability;

public class ModelTableAvailability {
String  ISBN;
String Book_Name;

public ModelTableAvailability(String SBN,String Book_Name) {
	this.ISBN = SBN ;
	this.Book_Name = Book_Name;
}

public String getBook_Name() {
	return Book_Name;
}

public void setBook_Name(String book_Name) {
	Book_Name = book_Name;
}

public String getISBN() {
	return ISBN;
}

public void setISBN(String iSBN) {
	ISBN = iSBN;
}





}

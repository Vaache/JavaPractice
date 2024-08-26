package LibraryManagerSystem;

public class Setter extends Book {

	Setter() {
		super();
	}

	void setBookName(String BookName) {
		super.BookName = BookName;
	}

	void setAuthorBook(String AuthorBook) {
		super.AuthorBook = AuthorBook;
	}

	void setYearPublish(int yearPublish) {
		super.yearPublish = yearPublish;
	}

	void setISBN(int ISBN) {
		super.ISBN = ISBN;
	}
	void setBookAccess(boolean BookAccess) {
		super.BookAccess = BookAccess;
	}
}

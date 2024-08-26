package LibraryManagerSystem;

public class Getter extends Book{

	Getter() {
		super();
	}

	String getBookName() {
		return super.BookName;
	}

	String getAuthorBook() {
		return super.AuthorBook;
	}

	int getYearPublish() {
		return super.yearPublish;
	}
	int getISBN() {
		return super.ISBN;
	}

	boolean getBookAccess() {
		return super.BookAccess;
	}
}
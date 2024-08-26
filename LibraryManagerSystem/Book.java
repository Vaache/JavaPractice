package LibraryManagerSystem;

public class Book {
	protected String BookName;
	protected String AuthorBook;
	protected int yearPublish;
	protected int ISBN;
	protected boolean BookAccess;
	public Setter setter = new Setter();
	public Getter getter = new Getter();

	Book(){}

	Book(String BookName, String AuthorBook, int yearPublish, int ISBN, boolean BookAccess) {
		this.BookName = BookName;
		this.AuthorBook = AuthorBook;
		this.yearPublish = yearPublish;
		this.ISBN = ISBN;
		this.BookAccess = BookAccess;
	}
}




package LibraryManagerSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
	List<Book> bookList = new ArrayList<>();

	void setBookLib(Book book) {
		this.bookList.add(book);
	}

	void removeBookLib(Book book) {
		if (bookList.isEmpty())
			return;
		for (int i = 0; i < bookList.size(); ++ i)
		{
			if (bookList.get(i).equals(book))
			{
				bookList.remove(i);
				break;
			}
		}
	}

	Book searchBook(String AuthorBook, int ISBN) {
		for (Book tmp : this.bookList)
			if (tmp.getter.getISBN() == ISBN || tmp.getter.getAuthorBook().equals(AuthorBook))
				return tmp;
		return null;
	}

	void BookIssuance (Book book) {
		for (Book it : this.bookList) {
			if (it.equals(book)) {
				book.setter.setBookAccess(true);
				break;
			}
		}
	}

	void BookReturn (Book book) {
		for (Book it : this.bookList) {
			if (it.equals(book)) {
				book.setter.setBookAccess(false);
				break;
			}
		}
	}

	void getAllBook() {
		if (this.bookList.isEmpty())
			return;
		for (Book tmp : this.bookList) {
			System.out.println("Book Name: " + tmp.getter.getBookName());
		}
	}
}

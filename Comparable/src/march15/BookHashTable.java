package march15;

public class BookHashTable {

	private int bookId;
	private String bookName;
	private String bookAuthor;
	public BookHashTable(int bookId, String bookName, String bookAuthor, int bookPrise) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrise = bookPrise;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public int getBookPrise() {
		return bookPrise;
	}
	public void setBookPrise(int bookPrise) {
		this.bookPrise = bookPrise;
	}
	private int bookPrise;
	
	}



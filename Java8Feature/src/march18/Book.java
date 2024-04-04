package march18;


public class Book {

	private int bookId;
	
	private String bookName;
	
	private String authName;
	
	private int bookprise;

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authName=" + authName + ", bookprise="
				+ bookprise + ", getBookId()=" + getBookId() + ", getBookName()=" + getBookName() + ", getAuthName()="
				+ getAuthName() + ", getBookprise()=" + getBookprise() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String bookName, String authName, int bookprise) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authName = authName;
		this.bookprise = bookprise;
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

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public int getBookprise() {
		return bookprise;
	}

	public void setBookprise(int bookprise) {
		this.bookprise = bookprise;
	}

	}



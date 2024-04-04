package march15;

import java.awt.print.Book;
import java.util.Hashtable;
import java.util.Map;

public class BookHashTable1 {

	public static void main(String[] args) {
		Hashtable<Integer,Book>h1=new Hashtable<Integer,Book>();
		
		//public Book(int bookId, String bookName, String bookAuthor, int prise) 
		Book b1=new Book(101,"c++","bajarne strousstrup",500);
		Book b2=new Book(102,"c","Dennis ritchie",200);
		Book b3=new Book(103,"java","james goslin",600);
		Book b4=new Book(104,"spring","rod jhonson",300);
		Book b5=new Book(105,"C#","microsoft",500);
		
		h1.put(101, b1);
		h1.put(102, b2);
		h1.put(103, b3);
		h1.put(104, b4);
		h1.put(105, b5);
		
		for(Map.Entry<Integer,Book>book:h1.entrySet()) { 
			
			int key=book.getKey();
			Book b=book.getValue();
			System.out.println("Book Details are:");
			
			System.out.println("Book Id:"+b.getBookId()+"\nBook Name:"+b.getBookName()+"\nBook Author Name:"+b.getBookAuthor()+"\nBook Prise:"+b1.getPrise());
		}

	}
	}



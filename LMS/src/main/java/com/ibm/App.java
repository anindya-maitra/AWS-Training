package com.ibm;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.SessionFactory;

import com.ibm.MyFactory.MySessionfactory;
import com.ibm.model.Book;
import com.ibm.model.Library;
import com.ibm.service.LibraryService;
import com.ibm.service.LibraryServiceImpl;


/**
 * Hello world!
 *
 */
public class App
{
	private static LibraryService libraryService;
	
	static {
		libraryService = new LibraryServiceImpl();
	}
	
    public static void main( String[] args )
    {
    	List<Book> books = new ArrayList<Book>();
    	String libraryId = UUID.randomUUID().toString();
    	String [] str = libraryId.split("-");
    	libraryId = str[0];
        Library library = new Library(libraryId, "National", "Kolkata", books);
        String bookId = UUID.randomUUID().toString();
    	String [] strB = bookId.split("-");
    	bookId = strB[0];
        Book book1 = new Book(bookId, "sdadsa", "dasda", library);
        books.add(book1);
        String bookId2 = UUID.randomUUID().toString();
    	String [] strB2 = bookId2.split("-");
    	bookId2 = strB2[0];
        Book book2 = new Book(bookId2, "sdasadsa", "deqda", library);
        books.add(book2);
        library = libraryService.insertLibrary(library);
        System.out.println("Inserted: " + library);
    }
}

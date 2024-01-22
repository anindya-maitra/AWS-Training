package com.ibm.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "books")
public class Book {
	
	@Id
	@Column(name = "book_id")
	private String bookId;
	
	@Column(name = "book_name")
	private String bookName;
	
	@Column(name = "book_publisher")
	private String bookPublisher;
	
	@ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "library_id")
	private Library library;

	public Book() {
		super();
	}

	public Book(String bookId, String bookName, String bookPublisher, Library library) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPublisher = bookPublisher;
		this.library = library;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	/*
	 * @Override public String toString() { return "Book [bookId=" + bookId +
	 * ", bookName=" + bookName + ", bookPublisher=" + bookPublisher + ", library="
	 * + library + "]"; }
	 */
	
	
}

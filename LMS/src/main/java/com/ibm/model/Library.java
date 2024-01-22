package com.ibm.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "library")
public class Library {
	
	@Id
	@Column(name = "library_id")
	private String libraryId;
	

	@Column(name = "library_name")
	private String libraryName;
	
	@Column(name = "library_location")
	private String libraryLocation;
	
	@OneToMany(mappedBy = "library", cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
	private List<Book> books;

	public Library() {
		super();
	}

	public Library(String libraryId, String libraryName, String libraryLocation, List<Book> books) {
		super();
		this.libraryId = libraryId;
		this.libraryName = libraryName;
		this.libraryLocation = libraryLocation;
		this.books = books;
	}

	public String getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLibraryLocation() {
		return libraryLocation;
	}

	public void setLibraryLocation(String libraryLocation) {
		this.libraryLocation = libraryLocation;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	/*@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", libraryLocation="
				+ libraryLocation + ", books=" + books + "]";*/
	
	
	
	
}

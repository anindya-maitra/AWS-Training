package com.ibm.service;

import com.ibm.model.Library;
import com.ibm.repo.LibraryRepository;
import com.ibm.repo.LibraryRepositoryImpl;

public class LibraryServiceImpl implements LibraryService{
	
	private static LibraryRepository libraryRepository;
	
	static {
		libraryRepository = new LibraryRepositoryImpl();
	}
	@Override
	public Library insertLibrary(Library library) {
		// TODO Auto-generated method stub
		return libraryRepository.insertLibrary(library);
	}

}

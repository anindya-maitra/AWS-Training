package com.ibm.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ibm.MyFactory.MySessionfactory;
import com.ibm.model.Library;

public class LibraryRepositoryImpl implements LibraryRepository {
	
	private static SessionFactory sessionFactory;
	
	
	static {
		try {
			sessionFactory = MySessionfactory.getSessionFactory();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public Library insertLibrary(Library library) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.persist(library);
		session.getTransaction().commit();
		return library;
	}	
}

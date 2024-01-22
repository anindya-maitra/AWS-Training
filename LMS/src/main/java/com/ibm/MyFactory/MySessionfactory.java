package com.ibm.MyFactory;

import org.hibernate.SessionFactory;


import org.hibernate.cfg.Configuration;

import com.ibm.model.Book;
import com.ibm.model.Library;


public class MySessionfactory {
	
	private static SessionFactory sessionFactory;
	
	static
	{
		try {
			sessionFactory=new Configuration().configure().addAnnotatedClass(Library.class).addAnnotatedClass(Book.class).buildSessionFactory();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static SessionFactory getSessionFactory()throws Exception {
		return sessionFactory;
	}

}

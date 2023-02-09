package com.Thursday_Lab;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mapping.Batch;
import com.mapping.Student;

public class OneToMany {

	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		//Library Object
		Library l1=new Library();
		l1.setLibrary_Id(3062);
		l1.setLibrary_Name("David Sassoon Library");
		
		//many books Object
		Books b1=new Books();
		b1.setBook_Id(101);
		b1.setBooK_Name("Sham Chi Aai");
		b1.setLibrary(l1);
		
		Books b2=new Books();
		b2.setBook_Id(102);
		b2.setBooK_Name("Classics");
		b2.setLibrary(l1);
		
		Books b3=new Books();
		b3.setBook_Id(103);
		b3.setBooK_Name("Harry Potter");
		b3.setLibrary(l1);
		
		Books b4=new Books();
		b4.setBook_Id(104);
		b4.setBooK_Name("Natsamrat");
		b4.setLibrary(l1);
		 
		Books b5=new Books();
		b5.setBook_Id(105);
		b5.setBooK_Name("Chhawa");
		b5.setLibrary(l1);
		 
		List<Books> books =new ArrayList<Books>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		
		l1.setBooks(books);
		session.save(l1);
		session.save(b1);
		session.save(b2);
		session.save(b3);
		session.save(b4);
		session.save(b5);
		tx.commit();
		
		 Library l=session.get(Library.class,3062);
		 System.out.println("Library: "+l.getLibrary_Id() );
        
//       for(Books b:l.getBooks()) 
//          {
//         	System.out.println(b.getBooK_Name());
//          }
        
     session.close();
	    factory.close();
  		
		
}
}
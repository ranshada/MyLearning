package com.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
// create session factory
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		//create session
		Session session=factory.getCurrentSession();
		
		
		
		try {
			
			session.beginTransaction();
			
			//query students
			
			List<Student> theStudents=session.createQuery("from Student ").list();
			
			
			//display students
			
			System.out.println("Students ");
			displayStudents(theStudents);
			
			theStudents=session.createQuery("from Student where last_name='Shada' ").list();

			System.out.println("who have last anem shada");
			displayStudents(theStudents);

			
			session.getTransaction().commit();
			System.out.println("Done!!!!");
			
		}
		finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudents) {
		for(Student tempStudent:theStudents) {
			System.out.println(tempStudent);
		}
	}

}

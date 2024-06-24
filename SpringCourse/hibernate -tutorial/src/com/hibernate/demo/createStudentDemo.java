package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class createStudentDemo {

	public static void main(String[] args) {
// create session factory
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		//create session
		Session session=factory.getCurrentSession();
		
		
		
		try {
			//save the java object
			System.out.println(" Creating a Student Object");
			Student tempStudent=new Student("Paul", "Wall", "paul@ibm.com");
			//create student object
			
			//start a transaction
			
			session.beginTransaction();
			System.out.println(" Saving a Student Object");

			session.save(tempStudent);
			
			//commit transaction
			
			session.getTransaction().commit();
			System.out.println("Done!!!!");
			
		}
		finally {
			factory.close();
		}
	}

}

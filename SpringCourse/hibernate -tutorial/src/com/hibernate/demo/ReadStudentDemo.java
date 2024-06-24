package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {
			// save the java object
			System.out.println(" Creating a Student Object");
			Student tempStudent = new Student("Daffy", "Duck", "Daffy@ibm.com");
			// create student object

			// start a transaction

			session.beginTransaction();
			System.out.println(" Saving a Student Object");
			System.out.println(tempStudent);
			session.save(tempStudent);

			// commit transaction

			session.getTransaction().commit();
			
			//find out the students id: primary key
			System.out.println("Saved Student generated id:  "+tempStudent.getId());
			
			//retrieve student based on id
			
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			
			System.out.println("\nGetting student id"+tempStudent.getId());
			
			Student myStudent=session.get(Student.class, tempStudent.getId());
			
			System.out.println("Get Complete"+myStudent);
			System.out.println("Done!!!!");

		} finally {
			factory.close();
		}
	}

}

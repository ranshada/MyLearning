package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class primaryKeyDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {
			// Create 3 studentssave the java object
			System.out.println(" Creating a Student Object");
			Student tempStudent = new Student("Ranjith", "Shada", "ran@ibm.com");

			Student tempStudent1 = new Student("Rachana", "Katakam", "rachana@ibm.com");
			Student tempStudent2 = new Student("Nivedha", "Shada", "Nivi@ibm.com");
// create student object

			// start a transaction

			session.beginTransaction();
			System.out.println(" Saving a Student Object");

			session.save(tempStudent);
			session.save(tempStudent1);

			session.save(tempStudent2);


			// commit transaction

			session.getTransaction().commit();
			System.out.println("Done!!!!");

		} finally {
			factory.close();
		}

	}

}

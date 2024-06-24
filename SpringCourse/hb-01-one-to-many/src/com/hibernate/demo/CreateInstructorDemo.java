package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.Student;

public class CreateInstructorDemo {

	public static void main(String[] args) {
// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {
			// save the java object
			System.out.println(" Creating a Student Object");
//			Instructor tempInstructor = new Instructor("ranjith", "shada", "ranshada@ibm.com"); // create student object
//			InstructorDetail tempInstructorDetail = new InstructorDetail("www.ranjith.com", "Love 2 code");
//			
			
			Instructor tempInstructor = new Instructor("Susan", "Public", "public@ibm.com"); // create student object
			InstructorDetail tempInstructorDetail = new InstructorDetail("www.youtube.com", "Gamer");
			// start a transaction

			
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			
			
			session.beginTransaction();
			System.out.println(" Saving a Student Object");

			// this will also save details object
			session.save(tempInstructor);

			// commit transaction

			session.getTransaction().commit();
			System.out.println("Done!!!!");

		} finally {
			
			session.close();
			factory.close();
		}
	}

}

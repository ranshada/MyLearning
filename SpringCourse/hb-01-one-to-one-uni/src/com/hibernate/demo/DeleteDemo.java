package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.Student;

public class DeleteDemo {

	public static void main(String[] args) {
// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {
		
			session.beginTransaction();
			System.out.println(" Deleting a Student Object");

			int theId=3000;
			Instructor tempInstructor=session.get(Instructor.class,theId);
			System.out.println("Found instructor"+tempInstructor);
			if(tempInstructor!=null)
			{
				System.out.println("Deleting "+ tempInstructor);
				session.delete(tempInstructor);
			}
			// this will also save details object

			// commit transaction

			session.getTransaction().commit();
			System.out.println("Done!!!!");

		} finally {
			factory.close();
		}
	}

}

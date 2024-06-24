package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.Student;

public class DeleteInstructorDetailDemo {

	public static void main(String[] args) {
// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();
			System.out.println(" Deleting a Student Object");
			int theId = 3;
			
			
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, theId);
			// this will also save details object
			System.out.println("Found Instructor Detail " + tempInstructorDetail);
			// commit transaction
			System.out.println("instructor detail associated" + tempInstructorDetail.getInstructor());
			
			
			System.out.println("***********Deleting tempinstructor detail*************");
			
			tempInstructorDetail.getInstructor().setInstructorDetail(null);
			session.delete(tempInstructorDetail);
			
			session.getTransaction().commit();
			System.out.println("Done!!!!");

		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		finally {
		}
			session.close();
			factory.close();
		}
	}



package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.Review;
import com.hibernate.demo.entity.Student;

public class GetCoursesforVenky {

	public static void main(String[] args) {
// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class).addAnnotatedClass(Student.class).buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();
			int theId=10;
			
			Course theCourse=session.get(Course.class, theId);
			
			System.out.println("loaded stident"+ theCourse);
			
			System.out.println("Deleting course"+theCourse);
			
			session.delete(theCourse);
			
			
			
			
			System.out.println("Deleted courses to the students");
			
			
			
			

			// commit transaction
			
		
			
			session.getTransaction().commit();
			System.out.println("Done!!!!");

		} finally {

			session.close();
			factory.close();
		}
	}

}

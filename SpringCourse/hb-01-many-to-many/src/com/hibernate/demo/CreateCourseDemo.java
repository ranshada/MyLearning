package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.Review;
import com.hibernate.demo.entity.Student;

public class CreateCourseDemo {

	public static void main(String[] args) {
// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class).buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {
			// save the java object
			System.out.println(" Creating a Student Object");
//			Instructor tempInstructor = new Instructor("ranjith", "shada", "ranshada@ibm.com"); // create student object
//			InstructorDetail tempInstructorDetail = new InstructorDetail("www.ranjith.com", "Love 2 code");
//			
			
		
			
			
			session.beginTransaction();
			
			Course course=new Course("Telugu");
			
			course.addReview(new Review("not too bad"));
			course.addReview(new Review("Excellet"));

			course.addReview(new Review("What a dumb course!"));

			System.out.println("Saving the course");
			System.out.println(course);
			System.out.println(course.getReviews());

			session.save(course);
			
			
			

			
			// this will also save details object

			// commit transaction

			session.getTransaction().commit();
			System.out.println("Done!!!!");

		} finally {
			
			session.close();
			factory.close();
		}
	}

}

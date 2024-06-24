package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.Review;
import com.hibernate.demo.entity.Student;

public class AddCoursesforVenky {

	public static void main(String[] args) {
// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class).addAnnotatedClass(Student.class).buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();
			int theId=1;
			
			Student theStudent=session.get(Student.class, theId);
			
			System.out.println("loaded stident"+ theStudent);
			
			System.out.println("COurses"+theStudent.getCourses());
			
//			Course tempCourse1=new Course("Rubiks cube-how to speed cube");
//			
//			Course tempCourse2=new Course("Atari 2600");
//			
//			tempCourse1.addStudent(theStudent);
//
//			tempCourse2.addStudent(theStudent);
//			
			
			System.out.println("Added courses to the students");
			
//			session.save(tempCourse2);
//			session.save(tempCourse1);
			
			
			

			// commit transaction
			
		
			
			session.getTransaction().commit();
			System.out.println("Done!!!!");

		} finally {

			session.close();
			factory.close();
		}
	}

}

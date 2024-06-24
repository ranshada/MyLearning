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
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class).addAnnotatedClass(Student.class).buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();

			// commit transaction
			
			Course tempCourse=new Course("Pacman- How to score one Million pointys");

			System.out.println("Saving the course");
			
			session.save(tempCourse);
			
			System.out.println("Saved course!!!!");
			
			Student tempStudent1=new Student("Ranjith"," Shada", "@ibm.com");
			Student tempStudent2=new Student("Venkatesh"," Shada", "Venky@ibm.com");
			Student tempStudent3=new Student("Varalaxmi"," Shada", "Vara@ibm.com");

			tempCourse.addStudent(tempStudent3);
			tempCourse.addStudent(tempStudent2);
			tempCourse.addStudent(tempStudent1);
			
			System.out.println("Saving students");
			
			session.save(tempStudent3);
			session.save(tempStudent2);
			session.save(tempStudent1);
			
			System.out.println("Saved students!!!!");
			
			session.getTransaction().commit();
			System.out.println("Done!!!!");

		} finally {

			session.close();
			factory.close();
		}
	}

}

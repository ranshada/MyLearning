package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.Student;

public class FetchJoinDemo {

	public static void main(String[] args) {
// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {
			// save the java object
			System.out.println(" Creating a Student Object");
//			Instructor tempInstructor = new Instructor("ranjith", "shada", "ranshada@ibm.com"); // create student object
//			InstructorDetail tempInstructorDetail = new InstructorDetail("www.ranjith.com", "Love 2 code");
//			

			session.beginTransaction();

			int theId = 1;

Query<Instructor> query=
session.createQuery("select i from Instructor i"
		+ " JOIN FETCH i.courses"
		+ " where i.id=:theInstructorId",Instructor.class);



query.setParameter("theInstructorId", theId);

Instructor tempInstructor=query.getSingleResult();
			System.out.println("ranjith code Instructor" + tempInstructor);
			// get courses for instructor
			

			// commit transaction

			session.getTransaction().commit();
			
			session.close();

			System.out.println("WE ARE CLOSING SESSION !!!!!!!!!!!!");
			System.out.println("ranjith code Courses" + tempInstructor.getCourses());

			
			
			
			System.out.println("ranjith code Done!!!!");

		} finally {

			session.close();
			factory.close();
		}
	}

}

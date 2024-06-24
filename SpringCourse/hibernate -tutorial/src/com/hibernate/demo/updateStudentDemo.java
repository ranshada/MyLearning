package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class updateStudentDemo {

	public static void main(String[] args) {
// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {
			
			int studentId=1;
			


System.out.println("Getting student with id: "+studentId);
			
			
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			
			
			
			
			Student myStudent=session.get(Student.class, studentId);
			
			System.out.println("updating student .....");
			
			myStudent.setEmail("ranshada@ibm.com");
			
			session.getTransaction().commit();
			
			System.out.println("Done!!!!");
			
			
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			//updating emails for all students
			
			System.out.println("Update email for all students");
			
			session.createQuery("update Student set email='foo@ibm.com'").executeUpdate();
			
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

}

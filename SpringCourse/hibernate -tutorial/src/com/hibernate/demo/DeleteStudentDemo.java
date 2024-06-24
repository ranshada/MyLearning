package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {
			
			int studentId=1;
			



			
			
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			
			
			
			
			//Student myStudent=session.get(Student.class, studentId);
			
			//session.delete(myStudent);
			
			System.out.println("deleted student .....");
			
			//delete student with id =2
			
			session.createQuery("delete from Student where id=2")
			.executeUpdate();
			
			session.getTransaction().commit();
			
			

		} finally {
			factory.close();
		}
	}

}

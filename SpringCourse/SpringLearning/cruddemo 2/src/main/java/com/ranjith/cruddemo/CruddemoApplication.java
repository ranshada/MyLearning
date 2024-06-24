package com.ranjith.cruddemo;

import com.ranjith.cruddemo.dao.StudentDAO;
import com.ranjith.cruddemo.entity.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {
	private static final Logger logger = LogManager.getLogger(CruddemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			updateStudentAll(studentDAO);
		};
	}

	private void updateStudentAll(StudentDAO studentDAO) {
		studentDAO.updateStudentAll();
	}

	private void updateStudent(StudentDAO studentDAO) {
		System.out.println("Updating Student :   "+studentDAO.updateStudent(3));
	}

	private void queryForStudents(StudentDAO studentDAO) {
		System.out.println("List of Students are  ------"+studentDAO.findAll());
	}

	private void retrive(StudentDAO studentDAO) {
		System.out.println("Retrived Student ID is ------"+studentDAO.findById(2));
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new Student");
		Student student=new Student("Rachana", "Shada", "rachshada");
		System.out.println("Saving new Student");

		studentDAO.save(student);
		System.out.println("saved student , ----student id"+student.getId());


	}

}

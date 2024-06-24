package com.ranjith.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {
	public static void main(String[] args) {
		String jdbcUrl="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
				String user="hbstudent";
		String pass="hbstudent";
		
		System.out.println("Connecting to Data");
		
		try {
			Connection con=DriverManager.getConnection(jdbcUrl,user,pass);
		System.out.println("Connection Successfull");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

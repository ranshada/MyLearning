package com.ranjith.springboot.cruddemo.dao;

import java.util.List;

import com.ranjith.springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();
	
	public Employee findId(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteId(int theId);



}

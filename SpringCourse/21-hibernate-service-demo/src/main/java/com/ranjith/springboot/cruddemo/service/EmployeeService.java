package com.ranjith.springboot.cruddemo.service;

import java.util.List;

import com.ranjith.springboot.cruddemo.entity.Employee;

public interface EmployeeService {

public List<Employee> findAll();
	
	public Employee findId(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteId(int theId);
}

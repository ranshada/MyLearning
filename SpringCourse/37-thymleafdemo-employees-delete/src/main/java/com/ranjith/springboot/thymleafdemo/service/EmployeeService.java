package com.ranjith.springboot.thymleafdemo.service;

import java.util.List;

import com.ranjith.springboot.thymleafdemo.entity.Employee;

public interface EmployeeService {

public List<Employee> findAll();
	
	public Employee findId(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteId(int theId);
}

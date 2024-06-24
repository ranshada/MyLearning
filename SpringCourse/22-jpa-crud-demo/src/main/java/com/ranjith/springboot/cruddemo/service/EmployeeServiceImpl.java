package com.ranjith.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ranjith.springboot.cruddemo.dao.EmployeeDAO;
import com.ranjith.springboot.cruddemo.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDAO employeeDAO;
	
	public EmployeeServiceImpl(@Qualifier("employeeDAOJPAImpl")EmployeeDAO theEmployeeDAO) {
		employeeDAO=theEmployeeDAO;
	}
	@Override
	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findId(int theId) {
		// TODO Auto-generated method stub
		return employeeDAO.findId(theId);
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		employeeDAO.save(theEmployee);
	}

	@Override
	@Transactional
	public void deleteId(int theId) {
		// TODO Auto-generated method stub
		employeeDAO.deleteId(theId);
	}

}

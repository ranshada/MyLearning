package com.ranjith.springboot.thymleafdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ranjith.springboot.thymleafdemo.dao.EmployeeRepoistory;
import com.ranjith.springboot.thymleafdemo.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepoistory employeeRepoistory;
	
	public EmployeeServiceImpl(EmployeeRepoistory theEmployeeRepoistory) {
		employeeRepoistory=theEmployeeRepoistory;
	}
	@Override
	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepoistory.findAllByOrderByLastNameAsc();
	}

	@Override
	@Transactional
	public Employee findId(int theId) {
		// TODO Auto-generated method stub
		Optional<Employee> findById = employeeRepoistory.findById(theId);
		Employee employee=null;
		if(findById.isPresent()) {
			employee=findById.get();
		}
		else {
			throw new RuntimeException("Do not find Employee id -- "+theId);
		}
		return employee;
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		employeeRepoistory.save(theEmployee);
	}

	@Override
	@Transactional
	public void deleteId(int theId) {
		// TODO Auto-generated method stub
		employeeRepoistory.deleteById(theId);
	}

}

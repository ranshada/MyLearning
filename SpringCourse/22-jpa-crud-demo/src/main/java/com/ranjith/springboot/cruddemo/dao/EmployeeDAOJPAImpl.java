package com.ranjith.springboot.cruddemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.ranjith.springboot.cruddemo.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO {

	private EntityManager entityManager;
	
	public EmployeeDAOJPAImpl(EntityManager theEntityManager) {
		entityManager=theEntityManager;
	}
	
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		Query theQuery=
				entityManager.createQuery("from Employee");
		
		List<Employee> employees=
				theQuery.getResultList();
		
		
		return employees;
	}

	@Override
	public Employee findId(int theId) {
		Employee theEmployee=entityManager.find(Employee.class, theId);
		
		
		// TODO Auto-generated method stub
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		Employee dbEmployee=entityManager.merge(theEmployee);
		theEmployee.setId(dbEmployee.getId());
	}

	@Override
	public void deleteId(int theId) {
		// TODO Auto-generated method stub
		Employee theEmployee=entityManager.find(Employee.class, theId);
		Query theQuery=
				entityManager.createQuery("delete from Employee where id=:employeeId");
		
		theQuery.setParameter("employeeId", theId);
	
		theQuery.executeUpdate();
	}
	

}

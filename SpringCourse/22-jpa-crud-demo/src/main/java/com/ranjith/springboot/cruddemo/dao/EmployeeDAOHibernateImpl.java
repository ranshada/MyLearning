package com.ranjith.springboot.cruddemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ranjith.springboot.cruddemo.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	private EntityManager entityManager;

	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<Employee> findAll() {
		// get hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// create query
		Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);

		// execute
		List<Employee> employees = theQuery.getResultList();

		// return results
		return employees;

	}

	@Override
	public Employee findId(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);

		// create query
		
		// execute
		Employee employee = currentSession.get(Employee.class, theId);

		// return results
		return employee;// TODO Auto-generated method stub
	}

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);

		// create query
		
		// execute
		 currentSession.saveOrUpdate(theEmployee);

	}

	@Override
	public void deleteId(int theId) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);

		// create query
		
		// execute
		Query theQuery= currentSession.createQuery(
				 "delete from Employee where id=:employeeId");
		 theQuery.setParameter("employeeId",theId);
		 theQuery.executeUpdate();
	}
	
	 

}

package com.luv2code.springdemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	//need to inject session factory
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {

		//get hibernate session
		
		Session currentSession=sessionFactory.getCurrentSession();
		
		
		//create query sort this by last name
		
		Query<Customer> thequery=currentSession.createQuery("from Customer order by lastName", Customer.class);
		
		List<Customer> customers=thequery.getResultList();
		
		//execute query and get result list
		
		//return the results
		
		
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		Session currentSession=sessionFactory.getCurrentSession();

		currentSession.saveOrUpdate(theCustomer);
		
	}

	@Override
	public Customer getCustomer(int theid) {
		Session currentSession=sessionFactory.getCurrentSession();
		Customer customer=currentSession.get(Customer.class, theid);
		return customer;
	}

	@Override
	public void deleteCustomer(int theId) {
		Session currentSession=sessionFactory.getCurrentSession();
Query theQuery=currentSession.createQuery("delete from Customer where id=:customerId");
theQuery.setParameter("customerId", theId);
theQuery.executeUpdate();
	}

	@Override
	public List<Customer> searchCustomer(String name) {
		Session currentSession=sessionFactory.getCurrentSession();
		Query<Customer> thequery=null;
		if(name!=null && name.trim().length()!=0) {

thequery =currentSession.createQuery("from Customer where lower(firstName) like :theName or lower(lastName) like :theName", Customer.class);
thequery.setParameter("theName", "%"+name.toLowerCase()+"%");
		
		
		}
		List<Customer> customers=thequery.getResultList();
		return customers;
	}



}

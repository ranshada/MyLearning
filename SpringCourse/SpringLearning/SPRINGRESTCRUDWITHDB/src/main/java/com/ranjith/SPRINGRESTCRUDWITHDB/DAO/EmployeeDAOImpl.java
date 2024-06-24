package com.ranjith.SPRINGRESTCRUDWITHDB.DAO;

import com.ranjith.SPRINGRESTCRUDWITHDB.EmployeeException.EmployeeExceptionImpl;
import com.ranjith.SPRINGRESTCRUDWITHDB.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private EntityManager entityManager;

    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery theQuery = entityManager.createQuery("from Employee", Employee.class);

        List<Employee> employees = theQuery.getResultList();
        return employees;
    }

    @Override
    public Employee findById(int employeeId) {
        TypedQuery theQuery = entityManager.createQuery("from Employee", Employee.class);

        List<Employee> employees = theQuery.getResultList();
        if (employeeId > employees.size() || employeeId < 0) {
            throw new EmployeeExceptionImpl("Employee not found for " + employeeId);
        }


        Employee employee = entityManager.find(Employee.class, employeeId);

        return employee;
    }



    @Override
    public Employee save(Employee employee) {
        Employee employee1 = entityManager.merge(employee);
        return employee1;

    }

    @Override
    public void deleteById(int id) {
Employee employee= entityManager.find(Employee.class, id);
    entityManager.remove(employee);

    }
}

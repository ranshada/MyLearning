package com.ranjith.SPRINGRESTCRUDWITHDB.DAO;

import com.ranjith.SPRINGRESTCRUDWITHDB.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

   Employee findById(int employeeId);



    Employee save(Employee employee);

    void deleteById(int id);
}

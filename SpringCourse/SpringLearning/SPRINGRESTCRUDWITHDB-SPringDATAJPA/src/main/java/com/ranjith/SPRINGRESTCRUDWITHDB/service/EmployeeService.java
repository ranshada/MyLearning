package com.ranjith.SPRINGRESTCRUDWITHDB.service;

import com.ranjith.SPRINGRESTCRUDWITHDB.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();

    Employee find(int employeeId);


    void deleteById(int id);


    Employee save(Employee employee);
}

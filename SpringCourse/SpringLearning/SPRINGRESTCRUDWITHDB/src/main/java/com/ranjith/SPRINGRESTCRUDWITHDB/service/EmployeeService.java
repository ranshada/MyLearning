package com.ranjith.SPRINGRESTCRUDWITHDB.service;

import com.ranjith.SPRINGRESTCRUDWITHDB.entity.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee find(int employeeId);


    void deleteById(int id);


    Employee save(Employee employee);
}

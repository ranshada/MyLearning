package com.ranjith.SPRINGRESTCRUDWITHDB.service;

import com.ranjith.SPRINGRESTCRUDWITHDB.DAO.EmployeeRepository;
import com.ranjith.SPRINGRESTCRUDWITHDB.EmployeeException.EmployeeExceptionImpl;
import com.ranjith.SPRINGRESTCRUDWITHDB.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee find(int employeeId) {

        Optional<Employee> result = employeeRepository.findById(employeeId);
        Employee employee= null;
        if(result.isPresent()){
            employee=result.get();
        }
        else {
            throw new EmployeeExceptionImpl("Employee not found for " + employeeId);
        }
        return employee;
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }


}

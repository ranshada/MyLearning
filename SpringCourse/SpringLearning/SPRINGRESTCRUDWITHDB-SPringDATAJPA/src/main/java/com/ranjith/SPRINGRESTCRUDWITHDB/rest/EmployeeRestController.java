package com.ranjith.SPRINGRESTCRUDWITHDB.rest;

import com.ranjith.SPRINGRESTCRUDWITHDB.entity.Employee;
import com.ranjith.SPRINGRESTCRUDWITHDB.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeService.findAll();

    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        return employeeService.find(employeeId);

    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(0);
        return employeeService.save(employee);

    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        Employee employee1= employeeService.save(employee);
        return employee1;

    }

    @DeleteMapping("/employees/{employeeId}")
    public String  updateEmployee(@PathVariable int employeeId){
        employeeService.deleteById(employeeId);
        return "Deleted EMployee with EMP id"+employeeId;

    }
}

package com.ranjith.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ranjith.springboot.cruddemo.entity.Employee;
import com.ranjith.springboot.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private EmployeeService employeeService;
	//inject employee dao
	
	@Autowired
	public EmployeeRestController(EmployeeService theemployeeService) {
		employeeService=theemployeeService;
	}
	
	//expose /employees and return all employees

	@GetMapping("/employee")
	public List<Employee> findAll(){
		return employeeService.findAll();
	}
	
	@GetMapping("/employee/{employeeId}")
	public Employee findAll(@PathVariable int employeeId){
		
		
		Employee employee= employeeService.findId(employeeId);
		if(employee==null) {
			throw new RuntimeException("Employee id not found   :"+ employeeId);
			
			
		}
		return employee;
		
	}
	
	@PutMapping("/employee")
	public void updateEmployee (@RequestBody Employee theEmployee){
		
		
		 
		
		employeeService.save(theEmployee);
		
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee theemployee){
		theemployee.setId(0);
		employeeService.save(theemployee);
		return theemployee;
	}
	
	@DeleteMapping("/employee/{employeeId}")
	public void deleteEmployee (@PathVariable int employeeId){
		
		Employee employee= employeeService.findId(employeeId);
		 
		if(employee==null) {
			throw new RuntimeException("Employee id not found   :"+ employeeId);
			
			
		}
		employeeService.deleteId(employeeId);
		
	}





}

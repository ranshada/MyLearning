package com.ranjith.springboot.thymleafdemo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ranjith.springboot.thymleafdemo.entity.Employee;
import com.ranjith.springboot.thymleafdemo.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	//load employee
	private EmployeeService theEmployeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		theEmployeeService=employeeService;
	}
	
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		List<Employee> theEmployee=theEmployeeService.findAll();
		theModel.addAttribute("employees", theEmployee);
		return "list-employee";
	}
	//add mapping for /list
	
	
}

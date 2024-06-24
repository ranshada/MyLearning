package com.ranjith.springboot.thymleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ranjith.springboot.thymleafdemo.model.Employee;

import jakarta.annotation.PostConstruct;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	//load employee
	private List<Employee> theEmployee;
	
	@PostConstruct
	private void loadData() {
		Employee empl= new Employee(1,"Leslie","Andrew","leslie.com");
		Employee empl2= new Employee(1,"Ranjith","shada","ranith.com");
		Employee empl3= new Employee(1,"rachana","katakam","rachana.com");

		theEmployee=new ArrayList<>();
		
		theEmployee.add(empl);
		theEmployee.add(empl2);
		theEmployee.add(empl3);
	}
	
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		theModel.addAttribute("employees", theEmployee);
		return "list-employee";
	}
	//add mapping for /list
	
	
}

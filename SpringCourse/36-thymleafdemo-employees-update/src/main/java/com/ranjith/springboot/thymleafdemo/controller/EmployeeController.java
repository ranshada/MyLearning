package com.ranjith.springboot.thymleafdemo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		return "employees/list-employee";
	}
	//add mapping for /list
	
	@GetMapping("/showFormForAdd")
	 public String showFormForAdd(Model theModel) {
		Employee theEmployee=new Employee();
		theModel.addAttribute("employee", theEmployee);
		
		return "employees/employee-form";
		
	}
	
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int theId, Model theModel) {
		Employee theEmployee=theEmployeeService.findId(theId);
		theModel.addAttribute(theEmployee);
		
		return "employees/employee-form";
	}
	
	
	
	
	
	
	
	@PostMapping("/save")
	 public String save(@ModelAttribute("employee") Employee theEmployee) {
		theEmployeeService.save(theEmployee);		
		return "redirect:/employees/list";
		
	}
	
}

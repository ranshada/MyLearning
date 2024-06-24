package com.ranjith.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//need a controller method to show initial form
	@RequestMapping("/showform")
	public String showForm() {
		return "helloworld-form";
	}
	
	

	// process the form
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//new method to read form data
	//add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		String parameter = request.getParameter("studentname");
		 
		parameter=parameter.toUpperCase();
		
		String result="Yo !   "+parameter;
		
		model.addAttribute("message",result);
		
		return "helloworld";
		
	}
	@RequestMapping("/processFormVersionThree")
public String letsShoutDude1(@RequestParam("studentname") String name, Model model) {
		
		 
		name=name.toUpperCase();
		
		String result="Yo !   "+name;
		
		model.addAttribute("message",result);
		
		return "helloworld";
		
	}
}

package com.ranjith.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent);

		return "student-form";

	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println(" The Student :  " + theStudent.getFirstName() + "   " + theStudent.getLastName()
		+"Country is :      "+theStudent.getCountry()+"    "
		+theStudent.getCountryOptions()+"     "+theStudent.getOperatingSystems());
		return "student-confirmation";

	}

}

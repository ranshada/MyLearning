package com.ranjith.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {
	@RequestMapping("/showform")
	public String displayTheForm() {
		return "helloworld-form";
	}
}

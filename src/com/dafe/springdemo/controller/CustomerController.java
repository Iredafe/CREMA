package com.dafe.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
@RequestMapping("/customer")
public class CustomerController {

	
	@RequestMapping("/list")
	public String lisCustomers(Model theModel) {
		
		
		return "list-customers";
	}
}

package com.dafe.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.dafe.springdemo.dao.CustomerDao;
import com.dafe.springdemo.entity.Customer;

@Controller
@EnableWebMvc
@RequestMapping("/customer")
public class CustomerController {

	//inject the customer dao
	
	@Autowired
	private CustomerDao customerDao;
	
	
	@RequestMapping("/list")
	public String lisCustomers(Model theModel) {
	
		//get the customer from the dao
		List <Customer> theCustomers = customerDao.getCustomers();
		
		//add the customer to the spring mvc model
		theModel.addAttribute("customers",theCustomers);
		
		return "list-customers";
	}
}

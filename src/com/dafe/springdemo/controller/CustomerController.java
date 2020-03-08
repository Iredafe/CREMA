package com.dafe.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.dafe.springdemo.entity.Customer;
import com.dafe.springdemo.service.CustomerService;

@Controller
@EnableWebMvc
@RequestMapping("/customer")
public class CustomerController {

	//inject the customer service
	
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/list")
	public String lisCustomers(Model theModel) {
	
		//get the customer from the dao
		List <Customer> theCustomers = customerService.getCustomers();
		
		//add the customer to the spring mvc model
		theModel.addAttribute("customers",theCustomers);
		
		return "list-customers";
	
	}


@GetMapping("/showFormForAdd")
public String showFormForAdd(Model theModel) {
	
	
	//create a model attribute
	
	Customer theCustomer= new Customer();
	theModel.addAttribute("customer",theCustomer);
	
	
	
	return "customer-form";
}

}

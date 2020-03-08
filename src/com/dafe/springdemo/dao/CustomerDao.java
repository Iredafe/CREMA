package com.dafe.springdemo.dao;

import java.util.List;

import com.dafe.springdemo.entity.Customer;

public interface CustomerDao {

	public List <Customer> getCustomers();

	public void saveCustomer(Customer theCustomer); 
	
}

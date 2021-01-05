package com.servletangular.service;

import java.util.List;

import com.servletangular.beans.customer;

public interface CustomerService {

	public List<customer> findCustomers();

	public void addCustomer(customer customer);

	public int userAuth(customer customer);

	customer getUser(String username);
	
	
}

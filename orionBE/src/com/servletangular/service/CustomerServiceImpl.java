package com.servletangular.service;

import java.util.ArrayList;
import java.util.List;

import com.servletangular.beans.customer;
import com.servletangular.dao.d.CustomerDAO;
import com.servletangular.dao.d.CustomerDAOimpl;


public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDAO customerDAO=new CustomerDAOimpl();
	
	
	@Override
	public List<customer> findCustomers() {
		// TODO Auto-generated method stub
		List<customer> list=new ArrayList<>();
		
		try {
			list=customerDAO.findCustomers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		System.err.println(e);
		}
		

		return list;
	}
	
	
	@Override
	public void addCustomer(customer customer) {
		try {
			customerDAO.addCustomer(customer);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
		System.err.println(e);
		}
	}
	
	@Override
	public int userAuth(customer customer) {
		int isUserAuthenticated = 0;
		try {
			isUserAuthenticated = customerDAO.userAuth(customer);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
		System.err.println(e);
		}
		return isUserAuthenticated;
	}
	
	@Override
	public customer getUser(String username) {
		customer cus = new customer();
		try {
			cus=customerDAO.getUserByUsername(username);
		}
		catch (Exception e){
			System.err.println(e);
		}
		
		return cus;
	}
	

}

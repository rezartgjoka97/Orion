package com.servletangular.dao.d;

import java.sql.SQLException;
import java.util.List;

import com.servletangular.beans.customer;


public interface CustomerDAO {
	public List<customer> findCustomers() throws SQLException;
	
	public void addCustomer(customer customer) throws SQLException;

	int userAuth(customer customer) throws SQLException;

	customer getUserByUsername(String username) throws SQLException;
}

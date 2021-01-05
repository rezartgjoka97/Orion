package com.servletangular.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.servletangular.beans.customer;
import com.servletangular.service.CustomerService;
import com.servletangular.service.CustomerServiceImpl;

import org.json.JSONException;
import org.json.JSONObject;

@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	
	public static final long serialVersionUID=1L;
	
	
	private CustomerService customerService;
	
	
	
	@Override
	public void init() throws ServletException{
		super.init();
		customerService=new CustomerServiceImpl();
	}
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.setHeader("Access-Control-Allow-Origin", "*");
		List<customer> List=customerService.findCustomers();
		PrintWriter out=resp.getWriter();
		
		resp.setContentType("application/json");
		Gson gson=new Gson();
		

			
			String jsonData=gson.toJson(List);

			out.print(jsonData);
			
		    
		
		
		out.close();
			
	}
	
	
	
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.setHeader("Access-Control-Allow-Origin", "*");
		PrintWriter out=resp.getWriter();
		StringBuffer jb = new StringBuffer();
		 String line = null;
		 JSONObject jsonObj =new JSONObject();
		 customer cus=new customer();
		 try {
		  BufferedReader reader = req.getReader();
		  while ((line = reader.readLine()) != null)
		   jb.append(line);
		 } catch (Exception e) { out.print(e); }
		 
		 try {

		  jsonObj = new JSONObject(jb.toString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		 try {
			cus.email=jsonObj.getString("email");
			cus.address=jsonObj.getString("address");
			cus.city=jsonObj.getString("city");
			cus.country=jsonObj.getString("country");
			cus.first_name=jsonObj.getString("first_name");
			cus.middle_name=jsonObj.getString("middle_name");
			cus.last_name=jsonObj.getString("last_name");
			cus.password=jsonObj.getString("password");
			cus.phone=jsonObj.getString("phone");
			cus.username=jsonObj.getString("username");
			cus.zip_code=jsonObj.getString("zip_code");
			customerService.addCustomer(cus);
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

			out.print(jsonObj);

			out.close();
		      
	}
	
	

}

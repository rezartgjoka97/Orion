package com.servletangular.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.servletangular.beans.customer;
import com.servletangular.service.CustomerService;
import com.servletangular.service.CustomerServiceImpl;

@WebServlet("/UserAuth")
public class UserAuth extends HttpServlet {

public static final long serialVersionUID=1L;

	private CustomerService customerService;
	
	@Override
	public void init() throws ServletException{
		super.init();
		customerService=new CustomerServiceImpl();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setContentType("application/json");
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
			  System.out.println("sss");
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			try {
				cus.username= jsonObj.getString("userName");
				cus.password=jsonObj.getString("password");
				out.print(customerService.userAuth(cus));
			}
			catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 
	}
}

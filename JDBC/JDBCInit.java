package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/init")
public class JDBCInit extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			// sTEP 1 LOAD THE JDBC DRIVER
			Class.forName("com.mysql.jdbc.Driver");
			
			// STEP 2 GET THE CONNECTION TO THE DATABSE
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Simplilearn");
			 
			 //
			  PrintWriter out = response.getWriter();
              out.println("SUCCESS!!");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
		}
		
	}

	
}
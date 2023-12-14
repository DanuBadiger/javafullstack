package com.simplilearn;

import java.io.*;
import java.sql.*;
import java.util.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/update-delete-records-demo")
public class UpdateDeleteRecordsDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DBUtil dbutil = null;

	@Override
	public void init() throws ServletException {
		super.init();

		InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
		Properties props = new Properties();
		try {
			props.load(in);

			dbutil = new DBUtil(props.getProperty("url"), props.getProperty("userid"), props.getProperty("password"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		// Get a DB connection
		Connection connection = dbutil.getConnection();

		try {
			// STEP 3 Create the Statement object.
			Statement stmt = connection.createStatement();
			
			String id = request.getParameter("id");
			String price = request.getParameter("price");
			
			if(id!=null && price!=null)
			stmt.executeUpdate("UPDATE eproduct set price="+price+" where ID="+id);
			
			out.println("Executed an update operation successfully <br>");	
			
			// delete a record
			//stmt.executeUpdate("DELETE from eproduct where ID=5");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void destroy() {
		super.destroy();
		try {
			dbutil.closeConnection();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
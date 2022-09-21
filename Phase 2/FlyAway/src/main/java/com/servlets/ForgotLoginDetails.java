package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ForgotLoginDetails")
public class ForgotLoginDetails extends HttpServlet {
	
Connection connection; 
	
	@Override
	public void init(ServletConfig config) throws ServletException {

		try {
			
			System.out.println("AddServlet init");
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root","Tiyaann2728031");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String username = request.getParameter("username");
		//String oldpassword = request.getParameter("oldpassword");
		String newpassword = request.getParameter("newpassword");

		try (Statement statement = connection.createStatement();) {

			String query = "update admin set password='" + newpassword + "' where username = '" + username + "' ";
			System.out.println("Query being executed: " + query);
			int rowsUpdated = statement.executeUpdate(query);
			System.out.println("Number of rows Update: " + rowsUpdated);

			PrintWriter pw = response.getWriter();
			pw.write("Password updated successfully");
			pw.write("<p><a href=\"admin.html\">Admin Home</a></p>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void destroy() {
		try {
			System.out.println("DeleteServlet.destroy() method. DB connection closed");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
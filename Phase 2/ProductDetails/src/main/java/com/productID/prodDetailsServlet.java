package com.productID;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class prodDetailsServlet
 */
@WebServlet("/prodDetailsServlet")
public class prodDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	Connection connection;
	
	@Override
	public void init() throws ServletException {
		
		try {
			System.out.println("prodDetailsServlet.init() method. DB connection created");
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root","Tiyaann2728031");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String prodID = request.getParameter("productID");
		
		System.out.println("doGet");
		try (Statement statement = connection.createStatement();) {
			
			// using ResultSet to store the result and then print using the results object
			ResultSet results = statement.executeQuery("select * from product where productID = '"+ prodID +"'");
			PrintWriter out = response.getWriter();
			
			out.println("<table>");
			out.println("<tr>");
			out.println("<th>productID</th>");
			out.println("<th>productName</th>");
			out.println("<th>Rate</th>");
			out.println("</tr>");
			while (results.next()) {
				out.println("<tr>");
				out.println("<td>" + results.getString(1) + "</td>");
				out.println("<td>" + results.getString(2) + "</td>");
				out.println("<td>" + results.getString(3) + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	public void destroy() {
		try {
			System.out.println("prodDetailsServlet.destroy() method. DB connection closed");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
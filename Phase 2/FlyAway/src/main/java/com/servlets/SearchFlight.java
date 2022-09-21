package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchFlight ")
public class SearchFlight extends HttpServlet {
	
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
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String sourceloc = request.getParameter("sourceloc ");
		String destiloc = request.getParameter("destiloc");

		try (PreparedStatement statement = connection.prepareStatement("select * from flights where boardinglocation = ? and destinationlocation = ?")) {

			statement.setString(1,sourceloc );
			statement.setString(2, destiloc);
			ResultSet rows = statement.executeQuery();
			PrintWriter out = response.getWriter();
			out.println("<table>");
			out.println("<tr>");
			out.println("<th>Flight_Number &nbsp; &nbsp;</th>");
			out.println("<th>Airline_Name&nbsp; &nbsp;</th>");
			out.println("<th>Boarding_Location&nbsp; &nbsp;</th>");
			out.println("<th>Destination_Location&nbsp; &nbsp;</th>");
			out.println("<th>Price</th>");
			out.println("</tr>");
			while (rows.next()) {
				out.println("<tr>");
				out.println("<td>" + rows.getString(1) + "</td>");
				out.println("<td>" + rows.getString(2) + "</td>");
				out.println("<td>" + rows.getString(3) + "</td>");
				out.println("<td>" + rows.getString(4) + "</td>");
				out.println("<td>" + rows.getString(5) + "</td>");
				out.println("</tr>");
				out.println("<br>");
			}
			out.println("</table>");
			PrintWriter pw = response.getWriter();

			
			pw.write("<p><a href=\"confirmflights.jsp\">Book Flight</a></p>");
			pw.write("<p><a href=\"index.html\">Home</a></p>");
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
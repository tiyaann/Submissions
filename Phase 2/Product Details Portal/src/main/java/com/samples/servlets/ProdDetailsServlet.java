package com.samples.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samples.model.getproducts;

/**
 * Servlet implementation class prodDetailsServlet
 */
@WebServlet("/ProdDetailsServlet")
public class ProdDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// creating a list "details" of type products 
	
	List<getproducts> details = new ArrayList<>();
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String prodID  = request.getParameter("productID");
		String prodName = request.getParameter("productName");
		String model = request.getParameter("model");
		
		// initializing the object of class products using the constructor
		getproducts obj = new getproducts(prodID, prodName, model );
		// adding the object "obj" to the list "details"
		details.add(obj);
		// Product_details is used in for-each loop in the .jsp file
		request.setAttribute("Product_Details", details);
		// forwarding the request to the .jsp file
		RequestDispatcher rd = request.getRequestDispatcher("/listProdDetails.jsp");
		rd.forward(request, response);
	}

}
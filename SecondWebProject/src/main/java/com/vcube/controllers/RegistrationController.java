package com.vcube.controllers;

import java.io.IOException;

import com.vcube.dao.DaoLayer;
import com.vcube.dto.Dto;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String FirstName = request.getParameter("FirstName");
		String UserName = request.getParameter("UserName");
		String Password = request.getParameter("Password");

		Dto dto = new Dto(FirstName, UserName, Password);

		DaoLayer da = new DaoLayer();

		String status = da.insertValues(dto);
		System.out.println(status);
		if (status.equals("true")) {
			System.out.println("in");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.forward(request, response);

			System.out.println("out");
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.forward(request, response);
		}

	}

}

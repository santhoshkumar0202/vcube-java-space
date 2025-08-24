package com.vcube.controllers;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.vcube.dao.UserDao;
import com.vcube.dto.UserDto;

/**
 * Servlet implementation class UserRegistration
 */
@WebServlet("/UserRegistration")
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UserRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name =request.getParameter("firstname");
	String phone_no =request.getParameter("phoneno");
		String email =request.getParameter("username");
		String password =request.getParameter("password");
		System.out.println("hello into controller");
		System.out.println(name+" "+phone_no+" "+email+" "+password);
		UserDto us=new UserDto();
		us.setName(name);
		us.setPhone(Integer.parseInt(phone_no));
		us.setEmail(email);
		us.setPassword(password);
		UserDao ud=new UserDao();
		String status =ud.insertToUserDb(us);
		if(status.equalsIgnoreCase("success")) {
			System.out.println("into controller");
			
			RequestDispatcher rs=request.getRequestDispatcher("login.jsp");
			rs.forward(request, response);
		}else {
			System.out.println("invalid creditials");
		}
	}

}

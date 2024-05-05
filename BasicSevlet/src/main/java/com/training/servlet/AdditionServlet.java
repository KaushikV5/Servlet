package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet(urlPatterns = "/add")
public class AdditionServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		Long parameter1 = Long.parseLong(request.getParameter("number1"));
		Long parameter2 = Long.parseLong(request.getParameter("number2"));
		PrintWriter writer = response.getWriter();
		writer.println("result :"+(parameter1+parameter2));
	}

}

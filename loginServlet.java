package com.camgimini.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.pojo.Login;
import com.capgemini.service.ServiceInterface;
import com.capgemini.service.ServiceInterfaceImpl;

public class loginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServiceInterface serviceInteraction = new ServiceInterfaceImpl();

		String uName = request.getParameter("userName");
		String uPassword = request.getParameter("userPwd");

		Login login = new Login();
		login.setUserName(uName);
		login.setPassWord(uPassword);

		if (serviceInteraction.isValidUser(login))
			response.sendRedirect("pages/SucessPage.html");
		else
			response.sendRedirect("pages/Login.html");

	}

}

package com.xworkz.tetra.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 5, urlPatterns = "/call sangeetha")
public class sushServlet extends HttpServlet {

	public sushServlet()
	{
		System.out.println("good morining");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName());
	}
}

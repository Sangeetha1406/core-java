package com.xworkz.tetra.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 4, urlPatterns = "/call amithabachan")
public class WindowServlet extends HttpServlet {
	public WindowServlet()
	{
		System.out.println("hai susuu......");
	}
	@Override
	protected void doGet(HttpServletRequest res, HttpServletResponse resp) throws ServletException,IOException {
		// TODO Auto-generated method stub
		System.out.println("hai .."+this.getClass().getSimpleName());
	}
}

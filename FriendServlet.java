package com.xworkz.tetra.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 6,urlPatterns = "/call friend")
public class FriendServlet extends HttpServlet {
	public FriendServlet()
	{
		System.out.println("hm....");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName());
	}
}

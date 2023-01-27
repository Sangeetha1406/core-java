package com.xworkz.tetra4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/Con")
public class Contact extends HttpServlet{
	public Contact() {
		System.err.println("running on servlet");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("running init method");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget in servlet..");
		String name=req.getParameter("userName");
		String email=req.getParameter("userEmail");
		String mobile=req.getParameter("userNumber");
		Long converMobile=Long.parseLong(mobile);
		String comments=req.getParameter("userComments");
		
		if(name.length()>3)
		{
			System.out.println("phone number is valid...");
		}
		else
		{
			System.out.println("phone number is not valid...");
		}
		System.out.println(name);
		System.out.println(email);
		System.out.println(mobile);
		System.out.println(comments);
		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if(name.length()>3)
		{
			writer.print("<span style='color:green;'>");
			writer.print("destination is success: " +name);
		}
		else
		{
			writer.print("<span style='color:red;'>");
			writer.print("destination is failure: "+name);
		}
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}
	
}

package com.xworkz.tetra4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/locations")
public class Location extends HttpServlet{
	public Location() {
		System.out.println("running default constructor in server... " +this.getClass().getSimpleName());
	}
	@Override
	public void init() throws ServletException {
		System.out.println("running init method in server....");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget method in server");
		String name=req.getParameter("personName");
		String email=req.getParameter("personEmail");
		String startPoint=req.getParameter("startPoint");
		String destination=req.getParameter("destination");
		String gender=req.getParameter("gender");
		if(destination.length()>3)
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
		System.out.println(name);
		System.out.println(email);
		System.out.println(startPoint);
		System.out.println(destination);
		System.out.println(gender);

		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if(destination.length()>3)
		{
			writer.print("<span style='color:green;'>");
			writer.print("destination is success: " +destination);
		}
		else
		{
			writer.print("<span style='color:red;'>");
			writer.print("destination is failure: "+destination);
		}
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}

}

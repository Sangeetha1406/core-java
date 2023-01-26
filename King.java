package com.xworkz.tetra2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns = "/kings")
public class King extends HttpServlet{
	public King() {
		System.out.println("running king... "+this.getClass().getSimpleName());
	}
	@Override
	public void init() throws ServletException {
		System.out.println("running init method...");	
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do get method.....");
		String Name=req.getParameter("name");
		String Region=req.getParameter("region");
		String noOfQueens=req.getParameter("noOfQueens");
		String DOB=req.getParameter("dob");
		String DOD=req.getParameter("dod");
		System.out.println(Name);
		System.out.println(Region);
		System.out.println(noOfQueens);
		System.out.println(DOB);
		System.out.println(DOD);

		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:green;'>");
		writer.print("king dead date is "+ DOD);
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
	}
	@Override
	public void destroy() {
		System.out.println("running destroy method..");
	}
	

}

package jspproject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/jspcalling")
public class Jsp1 extends HttpServlet{

	public Jsp1() {
		System.out.println("creating default constructor.."+this.getClass().getSimpleName());
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do post method in servlet....");
		String FirstName =req.getParameter("fName");
		String LastName =req.getParameter("lName");
		String Gender =req.getParameter("gender");
		String Reason =req.getParameter("res");
		String Address =req.getParameter("addrs");
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("Show.jsp");
		req.setAttribute("fName", FirstName);
		req.setAttribute("lName", LastName);
		req.setAttribute("gender", Gender);
		req.setAttribute("res", Reason);
		req.setAttribute("addrs", Address);
		
		dispatcher.forward(req, resp);
		
	}

}

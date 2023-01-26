package com.xworkz.tetra1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/Webseries")
public class WebSeries extends HttpServlet{
	public WebSeries() {
		System.out.println("webseries created.."+this.getClass().getSimpleName());
	}
	@Override
	public void init() throws ServletException {
		System.out.println("running init method...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do get method");
		System.out.println(Thread.currentThread().getName());
		String series_name=req.getParameter("series name...");
		String language=req.getParameter("language..");
		String episodes=req.getParameter("episodes...");
		String ott=req.getParameter("ott..");
		String budget=req.getParameter("budget..");
		
		System.out.println(series_name);
		System.out.println(language);
		System.out.println(episodes);
		System.out.println(ott);
		System.out.println(budget);
		
		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:red;'>");
		writer.print("webseries name "+ series_name + " sucessfully send");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
		
		
		
		
	}
	@Override
	public void destroy() {
		System.out.println("destroy webseries project....");
	}
}

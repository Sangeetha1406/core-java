package com.xworkz.tetra3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3,urlPatterns = "/our wish")
public class Family extends HttpServlet{
	
	public Family() {
		System.out.println("runing.."+this.getClass().getSimpleName());
	
	}
	@Override
	public void init() throws ServletException {
		System.out.println("intialize properties of web server...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do get....");
		String father_Name=req.getParameter("father_Name");
		String mother_Name=req.getParameter("mother_Name");
		String bro_name=req.getParameter("bro_name");
		String sis_name=req.getParameter("sis_name");
		String sil_place_name=req.getParameter("sil_place_name");
		String bil_name=req.getParameter("bil_name");
		String bro_job_name=req.getParameter("bro_job_name");
		String father_job_name=req.getParameter("father_job_name");
		String mother_job_name=req.getParameter("mother_job_name");
		String sis_job_name=req.getParameter("sis_job_name");
		String bro_place_name=req.getParameter("bro_place_name");
		String sis_scoty_name=req.getParameter("sis_scoty_name");
		String father_palce_name=req.getParameter("father_palce_name");
		String mother_place_name=req.getParameter("mother_place_name");
		String doughter_name=req.getParameter("doughter_name");
		String doughter_place_name=req.getParameter("doughter_place_name");
		String doughter_stream_name=req.getParameter("doughter_stream_name");
		String doughter_coll_name=req.getParameter("doughter_coll_name");
		String doughter_scotty_name=req.getParameter("doughter_scotty_name");
		String bro_vehicle_name=req.getParameter("bro_vehicle_name");
		
		
		System.out.println(father_Name);
		System.out.println(mother_Name);
		System.out.println(bro_name);
		System.out.println(sis_name);
		System.out.println(sil_place_name);
		System.out.println(bil_name);
		System.out.println(bro_job_name);
		System.out.println(father_job_name);
		System.out.println(mother_job_name);
		System.out.println(sis_job_name);
		System.out.println(bro_place_name);
		System.out.println(sis_scoty_name);
		System.out.println(father_palce_name);
		System.out.println(mother_place_name);
		System.out.println(doughter_name);
		System.out.println(doughter_place_name);
		System.out.println(doughter_stream_name);
		System.out.println(doughter_coll_name);
		System.out.println(doughter_scotty_name);
		System.out.println(bro_vehicle_name);
		
		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:red;'>");
		writer.print("doughter scoty name "+ doughter_scotty_name + " sucessfully send");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
		
	}
	@Override
	public void destroy() {
		System.out.println("runing destroy method...");
	}
}

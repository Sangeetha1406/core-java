package com.xworkz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/call")
public class Birds extends HttpServlet{

	public Birds() {
		System.out.println("calling");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("getting do get");
		String data="hai how are you";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("getting do post");
		String data1="hai hello";
		PrintWriter writer=resp.getWriter();
		writer.print(data1);
		resp.setContentType("text/plain");
	}
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("getting do delete");
		String data2="are you fine";
		PrintWriter writer=resp.getWriter();
		writer.print(data2);
		resp.setContentType("text/plain");

	}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("getting do put");
		String data3="are you ok";
		PrintWriter writer=resp.getWriter();
		writer.print(data3);
		resp.setContentType("text/plain");

	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("getting do options");
		String data3="are coming";
		PrintWriter writer=resp.getWriter();
		writer.print(data3);
		resp.setContentType("text/plain");

	}
	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("getting do trace");
		String data4="are coming or not";
		PrintWriter writer=resp.getWriter();
		writer.print(data4);
		resp.setContentType("text/plain");

	}
	
	protected void doPatch(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("getting do trace");
		String data4="are coming or not or go";
		PrintWriter writer=resp.getWriter();
		writer.print(data4);
		resp.setContentType("text/plain");


	}
}


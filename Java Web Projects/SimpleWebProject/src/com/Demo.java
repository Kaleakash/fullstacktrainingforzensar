package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//String variableName = request.getParameter("textfieldName");
		PrintWriter pw = response.getWriter();
			/*			int id = Integer.parseInt(request.getParameter("empId"))
			 * 		String name = request.getParameter("name");
			 * 		
			 */
	//	String hobbies[] = request.getParameterValues("hh");   // checkbox 
		
		RequestDispatcher rd1 = request.getRequestDispatcher("home");
		RequestDispatcher rd2 = request.getRequestDispatcher("login.html");
		
		String name = request.getParameter("user");
		String pass = request.getParameter("pass");
		if(name.equals("Ramesh") && pass.equals("123")) {
				pw.println("Successfully Login");
				rd1.forward(request, response);
		}else {
			pw.println("Failure try once again");
			rd2.include(request, response);
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		RequestDispatcher rd1 = request.getRequestDispatcher("home");
		RequestDispatcher rd2 = request.getRequestDispatcher("login.html");
		
		String name = request.getParameter("user");
		String pass = request.getParameter("pass");
		if(name.equals("Ramesh") && pass.equals("123")) {
				pw.println("Successfully Login");
				rd1.forward(request, response);
		}else {
			pw.println("Failure try once again in post method");
			rd2.include(request, response);
		}
	}
	
	
}

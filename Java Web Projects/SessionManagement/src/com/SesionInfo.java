package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SesionInfo
 */
public class SesionInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SesionInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    int count=0;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		HttpSession  hs = request.getSession();
		if(hs.isNew()) {
			pw.println("New Client");
		}else {
			pw.println("Old Client");
		}
		pw.println("<br/>Count is "+count);
		pw.println("<br/>Session id is "+hs.getId());
		pw.println("<br/> Session Creation time "+new Date(hs.getCreationTime()) );
		pw.println("<br/> Last Access time "+new Date(hs.getLastAccessedTime()) );
		pw.println("<br/>Default time for session is "+hs.getMaxInactiveInterval());
		hs.setMaxInactiveInterval(600);
		pw.println("<br/>Time set for session is "+hs.getMaxInactiveInterval());
		count++;
		if(count%5==0) {
			hs.invalidate();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

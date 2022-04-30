package com.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String un=request.getParameter("uname");
		System.out.println("Hello"+ un);
		
		String up=request.getParameter("upass");
		System.out.println(up);
		
		String ua=request.getParameter("uage");
		System.out.println(ua);
		
		
		
		// print the data to browser
		
		PrintWriter out=response.getWriter();
		out.println(un);
		out.println("<br>");
		
		out.println(up);
		out.println("<br>");
		
		out.println(ua);
		out.println("<br>");
		
		
	}

}

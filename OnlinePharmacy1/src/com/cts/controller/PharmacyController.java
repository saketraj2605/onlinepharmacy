package com.cts.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.services.PharmacyServiceImpl;

/**
 * Servlet implementation class PharmacyController
 */
@WebServlet("/")
public class PharmacyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PharmacyController() {
        super();
    }

    
	/**
	 * @see Servlet#init(ServletConfig)
	 */
    
    PharmacyServiceImpl ps = null ;
	public void init() throws ServletException {
		String jdbcDriver=getServletContext().getInitParameter("driver");
		String jdbcUsername=getServletContext().getInitParameter("jdbcusername");
		String jdbcPassword=getServletContext().getInitParameter("jdbcpassword");
		String jdbcURL=getServletContext().getInitParameter("url");
		ps = new PharmacyServiceImpl(jdbcDriver, jdbcUsername, jdbcPassword, jdbcURL);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getServletPath();
		switch(action)
		{
		case "/login":{
			System.out.println("inside case login");
			String x = request.getParameter("uname");    
			System.out.println(x);
		}

		default:
	
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

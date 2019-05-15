package com.cts.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("Login")
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {

    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {		// place your code here
		PrintWriter out=response.getWriter();  
        
	    String password=request.getParameter("pswd");
	    String userName=request.getParameter("uname");
	    if(password.equals("1234") && userName.equals("1234")){  
	    	RequestDispatcher rd=request.getRequestDispatcher("search.jsp"); 
	    }  
	    else{  
	    out.print("username or password error!");  
	    RequestDispatcher rd=request.getRequestDispatcher("index.html");  
	    rd.include(request, response);  
	    }  
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {

	}

}

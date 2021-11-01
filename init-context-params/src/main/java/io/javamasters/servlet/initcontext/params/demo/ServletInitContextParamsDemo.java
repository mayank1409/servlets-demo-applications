package io.javamasters.servlet.initcontext.params.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletInitContextParamsDemo extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		
		writer.write("<h1>Initialization Parameters</h1>");
		
		Enumeration<String> initParameterNames = getInitParameterNames();
		
		
		while (initParameterNames.hasMoreElements()) {
			String element = initParameterNames.nextElement();
			String parameter = getInitParameter(element);
			
			writer.write("<h1> " + element + ":" + parameter + "</h1>");
			
		}
		
		writer.write("<h1>Servlet Context Parameters</h1>");
		
		ServletContext servletContext = getServletContext();
		
		Enumeration<String> contextParametersNames = servletContext.getInitParameterNames();
		
		
		while (contextParametersNames.hasMoreElements()) {
			String element = contextParametersNames.nextElement();
			String parameter = servletContext.getInitParameter(element);
			
			writer.write("<h1> " + element + ":" + parameter + "</h1>");
			
		}
		
	}

}

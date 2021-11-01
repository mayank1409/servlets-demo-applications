package io.javamasters.lifecycle.servlet.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lifecycle")
public class ServletLifecycleDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method called");
	}

	public void destroy() {
		System.out.println("destroy method execution");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		System.out.println("service method execution");
		writer.write("<h1>Servlet Lifecycle Demo</h1>");
		writer.write("<h2>Current date and time is " + LocalDateTime.now() + "</h2>");

		
		
	}

}

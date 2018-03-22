package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Forward extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		if(name.equals("abcdef")&&pass.equals("123456")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("/hello.html");
			dispatcher.forward(request, response);
		}else{
			response.sendRedirect("http://www.baidu.com");
//			response.sendRedirect("/first_self_study/login.html");
		}
	}
	
}

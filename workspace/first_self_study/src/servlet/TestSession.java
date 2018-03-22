package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestSession extends HttpServlet {
	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//通过session对象获取表单中的值
		HttpSession session = request.getSession();
		String name =(String)session.getAttribute("name");
		
		//从web.xml配置信息中获取参数值
		ServletConfig config = this.getServletConfig();
		String editor = config.getInitParameter("editor");
		
		//从web.xml中获取整个项目都要用到的参数
		ServletContext context = this.getServletContext();
		String webmaster = context.getInitParameter("webmaster");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>你好</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 align=center>你好！"+name+"</h1>");
		out.println("<h1 align=center>你好！"+editor+"</h1>");
		out.println("<h1 align=center>你好！"+webmaster+"</h1>");

		out.println("</body>");
		out.println("</html>");
		
		//实现转发
		RequestDispatcher dispatcher = request.getRequestDispatcher("/hello.html");
		dispatcher.forward(request, response);
		

	}
}
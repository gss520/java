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
		//ͨ��session�����ȡ���е�ֵ
		HttpSession session = request.getSession();
		String name =(String)session.getAttribute("name");
		
		//��web.xml������Ϣ�л�ȡ����ֵ
		ServletConfig config = this.getServletConfig();
		String editor = config.getInitParameter("editor");
		
		//��web.xml�л�ȡ������Ŀ��Ҫ�õ��Ĳ���
		ServletContext context = this.getServletContext();
		String webmaster = context.getInitParameter("webmaster");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>���</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 align=center>��ã�"+name+"</h1>");
		out.println("<h1 align=center>��ã�"+editor+"</h1>");
		out.println("<h1 align=center>��ã�"+webmaster+"</h1>");

		out.println("</body>");
		out.println("</html>");
		
		//ʵ��ת��
		RequestDispatcher dispatcher = request.getRequestDispatcher("/hello.html");
		dispatcher.forward(request, response);
		

	}
}
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddTeam extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		//��������
		String name = request.getParameter("name");
		String slogan = request.getParameter("slogan");
		String leader = request.getParameter("leader");
		
		//���浽���ݿ�
		Connection cn = null;
		Statement stmt = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			//�������ݿ������
			String url = "jdbc:mysql://localhost:3306/training";
			String user = "root";
			String password = "1234";
			cn = DriverManager.getConnection(url,user,password);
			
			stmt=cn.createStatement();//����statement����
			
			//�����ݿ��в�������
			stmt.executeUpdate("insert into team (name,slogan,leader)values('"+name+"','"+slogan+"','"+leader+"')");
			
			//ͨ��response��ͻ���Ӧ����ʾ���ӳɹ�
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>����С��ɹ�</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1 align=center>����С��ɹ�</h1>");
			out.println("<p><a href='../addTeam.html'>��������</a>");
			out.println("<p><a href='viewTeams'>��ʾС��</a>");
			out.println("<p><a href='../index.html'>������ҳ</a>");
			out.println("</body>");
			out.println("</html>");
		}catch(Exception e){
			e.printStackTrace();
			
			//ͨ��response��ͻ���Ӧ����ʾ����ʧ��
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>����С��ʧ��</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1 align=center>����С��ʧ��</h1>");
			out.println("<p><a href='../addTeam.html'>��������</a>");
			out.println("<p><a href='viewTeams'>��ʾС��</a>");
			out.println("<p><a href='../index.html'>������ҳ</a>");
			out.println("</body>");
			out.println("</html>");			
		}finally{
			try{
				stmt.close();
				cn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}



}

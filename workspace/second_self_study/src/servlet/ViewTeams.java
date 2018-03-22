package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewTeams extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection cn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");//������������
			
//			�������ݿ�����
			String url = "jdbc:mysql://localhost:3306/training";
			String user = "root";
			String password = "1234";
			cn = DriverManager.getConnection(url,user,password);
			
			stmt = cn.createStatement();//����statement����
			
			rs = stmt.executeQuery("select * from team");//ִ�в�ѯ���
			
//			ͨ��response��ͻ���Ӧ��
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>��ʾС��</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1 align=center>��ʾ</h1>");
			out.println("<table border='1'align='center'>");
			out.println("<tr><th>����</th><th>�ں�</th><th>�鳤</th></tr>");
			
			//�ѽ�����е������ڱ���չ�ֳ���
			while(rs.next()){
				out.println("<tr>");
				out.println("<td>"+rs.getString("name")+"</td>");
				out.println("<td>"+rs.getString("slogan")+"</td>");
				out.println("<td>"+rs.getString("leader")+"</td>");
				out.println("</tr>");
			}
			out.println("<p><a href='../addTeam.html'>����С��</a>");
			out.println("<p><a href='../index.html'>������ҳ</a>");
			out.println("</body>");
			out.println("</html>");
			
		}catch(Exception e){
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>��ʾС��ʧ��</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1 align=center>��ʾС��ʧ��</h1>");
			out.println("<p><a href='../addTeam.html'>��������</a>");
			out.println("<p><a href='viewTeams'>��ʾС��</a>");
			out.println("<p><a href='../index.html'>������ҳ</a>");
			out.println("</body>");
			out.println("</html>");
		}finally{
			try{
				cn.close();
				stmt.close();
				rs.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}



}

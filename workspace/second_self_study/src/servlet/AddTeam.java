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
		
		//接收数据
		String name = request.getParameter("name");
		String slogan = request.getParameter("slogan");
		String leader = request.getParameter("leader");
		
		//保存到数据库
		Connection cn = null;
		Statement stmt = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			//建立数据库的连接
			String url = "jdbc:mysql://localhost:3306/training";
			String user = "root";
			String password = "1234";
			cn = DriverManager.getConnection(url,user,password);
			
			stmt=cn.createStatement();//创建statement对象
			
			//向数据库中插入数据
			stmt.executeUpdate("insert into team (name,slogan,leader)values('"+name+"','"+slogan+"','"+leader+"')");
			
			//通过response向客户端应答，显示增加成功
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>增加小组成功</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1 align=center>增加小组成功</h1>");
			out.println("<p><a href='../addTeam.html'>继续增加</a>");
			out.println("<p><a href='viewTeams'>显示小组</a>");
			out.println("<p><a href='../index.html'>返回首页</a>");
			out.println("</body>");
			out.println("</html>");
		}catch(Exception e){
			e.printStackTrace();
			
			//通过response向客户端应答，显示增加失败
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>增加小组失败</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1 align=center>增加小组失败</h1>");
			out.println("<p><a href='../addTeam.html'>继续增加</a>");
			out.println("<p><a href='viewTeams'>显示小组</a>");
			out.println("<p><a href='../index.html'>返回首页</a>");
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

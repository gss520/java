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
			Class.forName("com.mysql.jdbc.Driver");//加载驱动程序
			
//			建立数据库连接
			String url = "jdbc:mysql://localhost:3306/training";
			String user = "root";
			String password = "1234";
			cn = DriverManager.getConnection(url,user,password);
			
			stmt = cn.createStatement();//创建statement对象
			
			rs = stmt.executeQuery("select * from team");//执行查询语句
			
//			通过response向客户端应答
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>显示小组</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1 align=center>显示</h1>");
			out.println("<table border='1'align='center'>");
			out.println("<tr><th>组名</th><th>口号</th><th>组长</th></tr>");
			
			//把结果集中的数据在表中展现出来
			while(rs.next()){
				out.println("<tr>");
				out.println("<td>"+rs.getString("name")+"</td>");
				out.println("<td>"+rs.getString("slogan")+"</td>");
				out.println("<td>"+rs.getString("leader")+"</td>");
				out.println("</tr>");
			}
			out.println("<p><a href='../addTeam.html'>增加小组</a>");
			out.println("<p><a href='../index.html'>返回首页</a>");
			out.println("</body>");
			out.println("</html>");
			
		}catch(Exception e){
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>显示小组失败</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1 align=center>显示小组失败</h1>");
			out.println("<p><a href='../addTeam.html'>继续增加</a>");
			out.println("<p><a href='viewTeams'>显示小组</a>");
			out.println("<p><a href='../index.html'>返回首页</a>");
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

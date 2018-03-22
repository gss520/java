package servlet;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Register extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,
	ServletException{
		request.setCharacterEncoding("utf-8");//设置接收的字符
		
		
		//request接收表单数据
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String class1 = request.getParameter("class");
		String introduce = request.getParameter("introduce");
		
		//将数据保存再session中
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
	
		
		//把数组hobby拼接成一个字符串s_hobby
		String s_hobby = "";
		if(hobby!=null){
			for(int i=0;i<hobby.length;i++){
				s_hobby = s_hobby+hobby[i];
				//如果不是最后一个数组元素，加一个逗号做分隔符
				if(i<hobby.length-1){
					s_hobby = s_hobby+",";
				}
			}
		}
		//通过response向客户端应答，显示接收到的数据
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>处理表单</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 align=center>你好！</h1>");
		out.println("<p>姓名："+name);
		out.println("<p>密码："+pass);
		out.println("<p>性别："+gender);
		out.println("<p>爱好："+s_hobby);
		out.println("<p>班级："+class1);
		out.println("<p>自我介绍：");
		out.println("<p>"+introduce);
		out.println("<p><a href='testSession'>测试session</a>");
		out.println("</body>");
		out.println("</html>");
	}
	
}

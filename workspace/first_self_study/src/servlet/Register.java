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
		request.setCharacterEncoding("utf-8");//���ý��յ��ַ�
		
		
		//request���ձ�����
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String class1 = request.getParameter("class");
		String introduce = request.getParameter("introduce");
		
		//�����ݱ�����session��
		HttpSession session = request.getSession();
		session.setAttribute("name", name);
	
		
		//������hobbyƴ�ӳ�һ���ַ���s_hobby
		String s_hobby = "";
		if(hobby!=null){
			for(int i=0;i<hobby.length;i++){
				s_hobby = s_hobby+hobby[i];
				//����������һ������Ԫ�أ���һ���������ָ���
				if(i<hobby.length-1){
					s_hobby = s_hobby+",";
				}
			}
		}
		//ͨ��response��ͻ���Ӧ����ʾ���յ�������
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>�����</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 align=center>��ã�</h1>");
		out.println("<p>������"+name);
		out.println("<p>���룺"+pass);
		out.println("<p>�Ա�"+gender);
		out.println("<p>���ã�"+s_hobby);
		out.println("<p>�༶��"+class1);
		out.println("<p>���ҽ��ܣ�");
		out.println("<p>"+introduce);
		out.println("<p><a href='testSession'>����session</a>");
		out.println("</body>");
		out.println("</html>");
	}
	
}

package verification;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logcheck
 */
@WebServlet("/Logcheck")
public class Logcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Logcheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String userid = request.getParameter("userid");
		String userpwd = request.getParameter("userpwd");
		String usercheckcode = request.getParameter("checkcode");
		String info = "";
		HttpSession session = request.getSession();
		String servercheckcode = (String)session.getAttribute("checkCode");
		System.out.println(userid+userpwd);
		if(!servercheckcode.equalsIgnoreCase(usercheckcode)){
			info = "验证码不正确，请重新输入";
		}else if("san".equals(userid)&&"123".equals(userpwd)){
			session.setAttribute("userid",userid);
			info = "登陆成功";		
			request.setAttribute("info", info);
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		else{
			info = "用户名或密码不正确";
		}
		request.setAttribute("info", info);
		RequestDispatcher rd = request.getRequestDispatcher("land.jsp");				
		rd.forward(request, response);
	}

}

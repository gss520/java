package user_register;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Insert
 */
@WebServlet("/Insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("GB2312");
		int userid = Integer.parseInt(request.getParameter("userid"));
		int userpwd = Integer.parseInt(request.getParameter("userpwd"));
		String sex = request.getParameter("sex");
		int qq = Integer.parseInt(request.getParameter("qq"));
		String name=request.getParameter("name");
		int IDcard = Integer.parseInt(request.getParameter("IDcard")); 
		String sql1 = "insert into user_b(userid,userpwd,sex,qq,name,IDcard)";
		String sql2 = "values("+userid+",'"+userpwd+"','"+sex+"',"+qq+",'"+name+"',"+IDcard+")";
		String sql=sql1+sql2;
		DbUtil run = new DbUtil();
		int n = run.updateSQL(sql);
		if(n>=1)
			request.getRequestDispatcher("success.jsp").forward(request, response);
		else
			request.getRequestDispatcher("error.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

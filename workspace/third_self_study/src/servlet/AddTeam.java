package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Team;
import business.TeamBusiness;

public class AddTeam extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");//设置接收的字符集
		
		//接收数据
		String name = request.getParameter("name");
		String slogan = request.getParameter("slogan");
		String leader = request.getParameter("leader");
		
		//创建team对象并设置属性
		Team team = new Team();
		team.setName(name);
		team.setSlogan(slogan);
		team.setLeader(leader);
		
		request.setAttribute("team", team);//把对象保存在request对象里
		
		//保存到数据库中
		try{
			TeamBusiness.addTeam(team);
			
			//转向成功页面
			RequestDispatcher rd = request.getRequestDispatcher("../addTeamSuccess.jsp");
			rd.forward(request,response);
		}catch(Exception e){
			e.printStackTrace();
			
			//转向失败页面
			RequestDispatcher rd = request.getRequestDispatcher("../addTeamFail.jsp");
			rd.forward(request,response);
		}
		
	}

}

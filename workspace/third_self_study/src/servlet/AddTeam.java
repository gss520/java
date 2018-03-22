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
		request.setCharacterEncoding("utf-8");//���ý��յ��ַ���
		
		//��������
		String name = request.getParameter("name");
		String slogan = request.getParameter("slogan");
		String leader = request.getParameter("leader");
		
		//����team������������
		Team team = new Team();
		team.setName(name);
		team.setSlogan(slogan);
		team.setLeader(leader);
		
		request.setAttribute("team", team);//�Ѷ��󱣴���request������
		
		//���浽���ݿ���
		try{
			TeamBusiness.addTeam(team);
			
			//ת��ɹ�ҳ��
			RequestDispatcher rd = request.getRequestDispatcher("../addTeamSuccess.jsp");
			rd.forward(request,response);
		}catch(Exception e){
			e.printStackTrace();
			
			//ת��ʧ��ҳ��
			RequestDispatcher rd = request.getRequestDispatcher("../addTeamFail.jsp");
			rd.forward(request,response);
		}
		
	}

}

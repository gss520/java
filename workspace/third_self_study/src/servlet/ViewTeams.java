package servlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Team;
import business.TeamBusiness;

public class ViewTeams extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			Collection<Team> teams = TeamBusiness.allTeams();
			request.setAttribute("teams",teams);
			
			RequestDispatcher rd = request.getRequestDispatcher("../viewTeams.jsp");
			rd.forward(request, response);
			
		}catch(Exception e){
			e.printStackTrace();
			
			RequestDispatcher rd = request.getRequestDispatcher("../viewTeamsFail.jsp");
			rd.forward(request, response);
		}
	}
	
}

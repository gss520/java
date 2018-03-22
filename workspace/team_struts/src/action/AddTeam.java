package action;

import bean.Team;
import business.TeamBusiness;

public class AddTeam {
	private Team team;

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
	public String execute(){
		try{
			TeamBusiness.addTeam(team);
			return "success";
		}catch(Exception e){
			e.printStackTrace();
			return "error";
		}
		
	}
}

package business;

import database.DateSourse;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

import bean.Team;

public class TeamBusiness {
	public static void addTeam(Team team) throws Exception{
		Connection cn =null;
		Statement stmt =null;
		try{
			cn = DateSourse.getConnection();
			stmt = cn.createStatement();
			stmt.executeUpdate("insert into team(name,slogan,leader)values('"+team.getName()+"','"
					+team.getSlogan()+"','"+team.getLeader()+"')");
		}catch(Exception e){
			throw e;
		}finally{
			try{
				stmt.close();
				cn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public static Collection<Team> allTeams() throws Exception{
		ArrayList<Team> teams = new ArrayList<Team>(); //�������϶���
		
		//�����ݿ��л�ȡ����
		Connection cn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			cn = DateSourse.getConnection();
			stmt = cn.createStatement();
			rs = stmt.executeQuery("select * from team");
			
			while(rs.next()){
				Team team = new Team();//����team����
				//�����ݿ�ȡ�õ���������team���������
				team.setId(rs.getInt("id"));
				team.setName(rs.getString("name"));
				team.setSlogan(rs.getString("slogan"));
				team.setLeader(rs.getString("leader"));
				
				teams.add(team);//��team����ŵ�����teams��
			}
		}catch(Exception e){
			throw e;
		}finally{
			try{
				rs.close();
				stmt.close();
				cn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return teams;
	}
}

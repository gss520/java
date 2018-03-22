package business;

import database.DataSourse;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

import bean.DBParam;
import bean.Team;

public class TeamBusiness {
	public static void addTeam(Team team,DBParam dbParam) throws Exception{
		Connection cn =null;
		Statement stmt =null;
//		try{
			cn = DataSourse.getConnection(dbParam);
			stmt = cn.createStatement();
			stmt.executeUpdate("insert into team(name,slogan,leader)values('"+team.getName()+"','"
					+team.getSlogan()+"','"+team.getLeader()+"')");
//		}catch(Exception e){
//			throw e;
//		}finally{
//			try{
//				stmt.close();
//				cn.close();
//			}catch(Exception e){
//				e.printStackTrace();
//			}
//		}
	}
}

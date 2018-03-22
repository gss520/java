package user_register;
import java.sql.*;

public class DbUtil {
	private Connection con = null;
	private PreparedStatement pstm = null;
	private ResultSet rs = null;
	public int updateSQL(String sql){
		int n=-1;
		try{
			con = ConnectDbase.getDBconnection();
			System.out.println(sql);
			if(con==null){
			System.out.println("null");}
			pstm = con.prepareStatement(sql);
			n = pstm.executeUpdate();
			
		}catch(SQLException e){e.printStackTrace();}
		ConnectDbase.closeDB(con,pstm);
		return n;
	}
	public ResultSet QuerySQL(String sql){
		try{
			con = ConnectDbase.getDBconnection();
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			return rs;
		}catch(SQLException e){e.printStackTrace();}
		return null;
	}
}

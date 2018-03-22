package user_login;
import java.sql.*;

public class User {
	private String userid = null;
	private String userpwd = null;
	public String getUserid(){return userid;}
	public void setUserid(String userid){this.userid = userid;}
	public String getUserpwd(){return userpwd;}
	public void setUserpwd(String userpwd){this.userpwd = userpwd;}
	public User(){}
	public User(String a,String b){
		userid=a;userpwd=b;
	}
	public boolean yanzheng_user(String userid2,String userpwd2) throws SQLException,ClassNotFoundException{
		boolean f = false;
		ConnectDbase cdb = new ConnectDbase();
		Connection conn = cdb.getConnect();
		String sql = "select * from user_b where(userid=? and userpwd=?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userid2);
		pstmt.setString(2,userpwd2);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) f=true;
		else f=false;
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
		return f;
	}
}

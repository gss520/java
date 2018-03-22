package user_login;
import java.sql.*;

public class ConnectDbase {
	private String driverName = "com.mysql.jdbc.Driver";
	private String userName = "root";
	private String userPwd = "1234";
	private String dbName = "user";
	public String getDriverName(){return driverName;}
	public void setDriverName(String driverName){this.driverName = driverName;}
	public String getuserPwd(){return userPwd;}
	public void setuserPwd(String userPwd){this.userPwd = userPwd;}
	public String getdbName(){return dbName;}
	public void setdbName(String dbName){this.dbName = dbName;}
	
	//实现数据库的连接的方法
	public Connection getConnect() throws SQLException,ClassNotFoundException{
		String url1 = "jdbc:mysql://localhost:3306/"+dbName;
		String url2 = "?user="+userName+"&Password="+userPwd;
		String url3 = "&useUnicode = true&characterEncoding=GB2312";
		String url = url1+url2+url3;
		Class.forName(driverName);
		return DriverManager.getConnection(url);
	}
		
}

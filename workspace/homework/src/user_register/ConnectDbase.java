package user_register;
import java.sql.*;

public class ConnectDbase {
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String userName = "root";
	private static String userPwd = "1234";
	private static String dbName = "user";
	public static Connection getDBconnection(){
		String url1 = "jdbc:mysql://localhost/"+dbName;
		String url2 = "?user="+userName+"&password="+userPwd;
		String url3 = "&useUnicode = true&characterEncoding=GB2312";
		String url = url1+url2+url3;	
		try{
		Class.forName(driverName);
		Connection con = DriverManager.getConnection(url);
		return con;
		}catch(Exception e){e.printStackTrace();}
		return null;
	}
	public static void closeDB(Connection con,PreparedStatement pstm){
		try{
		if(pstm!=null)pstm.close();
		if(con!=null)con.close();
		}catch(SQLException e){e.printStackTrace();}
	}
	
	//实现数据库的连接的方法

		
}

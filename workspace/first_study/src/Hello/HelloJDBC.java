package Hello;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJDBC {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/guo";
	static final String USER = "root";
	static final String PASSWORD = "1234";
	
	public static void helloword() throws ClassNotFoundException{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		//1.装载驱动程序
		Class.forName(JDBC_DRIVER);
		try {
			//2.建立数据库连接
			conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
			//3.执行sql语句
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select userName from user");
			//4.获取执行结果
			while(rs.next()){
				System.out.println("hello"+rs.getString("userName"));
			}	
		} catch (SQLException e) {
			//2. 异常处理
			e.printStackTrace();
		}finally{
			//清理关闭
			try {
				if(conn!=null){
					conn.close();
				}
				if(stmt!=null){
					stmt.close();
				}
				if(rs!=null){
				rs.close();
			}
			} catch (Exception e) {
				// TODO: handle exception
				
			}
			
		}
	}
	public static void main(String[] args)throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.print("point");
		helloword();
	}

}

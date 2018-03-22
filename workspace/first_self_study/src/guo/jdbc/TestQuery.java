package guo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection cn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");//加载驱动程序
			
			//建立数据库的连接
			String url = "jdbc:mysql://localhost:3306/training";
			String user = "root";
			String password = "1234";
			cn = DriverManager.getConnection(url,user,password);
			stmt = cn.createStatement();//创建statement对象
			//执行查询
			rs = stmt.executeQuery("select * from team");//执行查询
			while(rs.next()){
				System.out.print(rs.getInt("id")+" ");
				System.out.print(rs.getString("name")+" ");
				System.out.print(rs.getString("slogan")+" ");
				System.out.print(rs.getString("leader")+" \n");
			}
			System.out.println("查询成功");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				stmt.close();
				cn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}

package guo.jdbc;

import java.sql.*;

public class TestInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection cn = null;
		Statement stmt = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");//加载驱动程序
			
			//建立数据库的连接
			String url = "jdbc:mysql://localhost:3306/training";
			String user = "root";
			String password = "1234";
			cn = DriverManager.getConnection(url,user,password);
			stmt = cn.createStatement();//创建statement对象
			//向数据库中增加数据
			stmt.executeUpdate("insert into team(name,slogan,leader)value('团队','哈','郭帅')");
			System.out.println("插入成功");
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

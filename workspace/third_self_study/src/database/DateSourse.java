package database;

import java.sql.*;

public class DateSourse {

	public static Connection getConnection() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");//������������
		
		//�������ݿ������
		String url="jdbc:mysql://localhost:3306/training";
		String user="root";
		String password="1234";
		Connection cn = DriverManager.getConnection(url,user,password);
		
		return cn;
		
	}
}

package guo.jdbc;

import java.sql.*;

public class TestInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection cn = null;
		Statement stmt = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");//������������
			
			//�������ݿ������
			String url = "jdbc:mysql://localhost:3306/training";
			String user = "root";
			String password = "1234";
			cn = DriverManager.getConnection(url,user,password);
			stmt = cn.createStatement();//����statement����
			//�����ݿ�����������
			stmt.executeUpdate("insert into team(name,slogan,leader)value('�Ŷ�','��','��˧')");
			System.out.println("����ɹ�");
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

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
			Class.forName("com.mysql.jdbc.Driver");//������������
			
			//�������ݿ������
			String url = "jdbc:mysql://localhost:3306/training";
			String user = "root";
			String password = "1234";
			cn = DriverManager.getConnection(url,user,password);
			stmt = cn.createStatement();//����statement����
			//ִ�в�ѯ
			rs = stmt.executeQuery("select * from team");//ִ�в�ѯ
			while(rs.next()){
				System.out.print(rs.getInt("id")+" ");
				System.out.print(rs.getString("name")+" ");
				System.out.print(rs.getString("slogan")+" ");
				System.out.print(rs.getString("leader")+" \n");
			}
			System.out.println("��ѯ�ɹ�");
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

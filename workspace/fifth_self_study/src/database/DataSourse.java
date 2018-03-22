package database;

import java.sql.Connection;
import java.sql.DriverManager;

import bean.DBParam;

public class DataSourse {
	public static Connection getConnection(DBParam dbParam) throws Exception{
		Class.forName(dbParam.getDriver());//����jdbc��������
	
		//�������ݿ�����
		Connection cn = DriverManager.getConnection(dbParam.getUrl(),dbParam.getUser(),
				dbParam.getPassword());
		
		return cn;
	}
}

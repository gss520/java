package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import bean.DBParam;

public class JDBCListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		ServletContext servletContext = event.getServletContext();//��ȡServletContext����
		
		//��ȡ�����ļ��е����ݿ����Ӳ���
		String driver = servletContext.getInitParameter("driver");
		String url = servletContext.getInitParameter("url");
		String user = servletContext.getInitParameter("user");
		String password = servletContext.getInitParameter("password");
		
		DBParam dbParam = new DBParam();//����һ��DBParam����dbParam
		
		//�����ݿ����Ӳ�������ΪdbParam������
		dbParam.setDriver(driver);
		dbParam.setUrl(url);
		dbParam.setUser(user);
		dbParam.setPassword(password);
		
		servletContext.setAttribute("dbParam", dbParam);//��dbParam���浽servletContext��
		
	}

}

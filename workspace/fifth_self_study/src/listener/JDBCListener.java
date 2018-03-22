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
		ServletContext servletContext = event.getServletContext();//获取ServletContext对象
		
		//读取配置文件中的数据库连接参数
		String driver = servletContext.getInitParameter("driver");
		String url = servletContext.getInitParameter("url");
		String user = servletContext.getInitParameter("user");
		String password = servletContext.getInitParameter("password");
		
		DBParam dbParam = new DBParam();//创建一个DBParam对象dbParam
		
		//把数据库连接参数设置为dbParam的属性
		dbParam.setDriver(driver);
		dbParam.setUrl(url);
		dbParam.setUser(user);
		dbParam.setPassword(password);
		
		servletContext.setAttribute("dbParam", dbParam);//把dbParam保存到servletContext里
		
	}

}

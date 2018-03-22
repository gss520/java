<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" import="java.sql.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'datebase.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <%
        request.setCharacterEncoding("utf-8");
        String usename=request.getParameter("usename");
        String pwd1=request.getParameter("pwd");
    %>
    <% 
    String driverName="com.mysql.jdbc.Driver";//驱动程序名
    String uName="root";//数据库用户名
    String uPwd="1234";//密码
    String dbName="guo";//数据库名
    String url1="jdbc:mysql://hocalhost:3306/"+dbName;
    String url2="?user="+uName+"&password="+uPwd;
    String url3="&useUnicode=true&characterEncoding=UTF-8";
    String url=url1+url2+url3;//形成带数据库读写编码的数据库连接字
    Class.forName(driverName);//加载并注册驱动程序
    Connection conn=DriverManager.getConnection(url);//获取数据库连接对象
    //String sql="select * from students";
    //PreparedStatement pstmt=conn.prepareStatement(sql);
    //ResultSet rs=pstmt.executeQuery();
    %>
    <%
        if (conn!=null)
        {
            String sql="select * from user where id='"+usename+"'and userName='"+pwd1+"'";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs=pstmt.executeQuery();
            if(rs.next())
            {
                response.sendRedirect("Home.jsp");
            }
            else 
            {
                out.print("用户名或密码错误，请重新输入！");
     %>
                <a href="javascript:history.back()">返回</a>
            <%
            }
            //输出连接信息
            out.println("数据库连接成功!");
            //关闭数据库连接
            rs.close();
            pstmt.close();
            conn.close();
        }
        else
        {
            //输出连接信息
            out.println("数据库连接失败！");
        }
    %>

  </body>
</html>

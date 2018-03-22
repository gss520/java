<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>利用提交条件删除记录页面</title>
</head>
<body>
<%
	String driverName = "com.mysql.jdbc.Driver";
	String userName = "root";
	String userPwd ="1234";
	String dbName ="students";
	String url1="jdbc:mysql://localhost:3306/"+dbName;
	String url2="?user="+userName+"&password="+userPwd;
	String url3="&userUnicode=true&characterEncoding=utf-8";
	String url=url1+url2+url3;
	Class.forName(driverName);
	Connection conn=DriverManager.getConnection(url);
	
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String sex = request.getParameter("sex");
	String ww1 = request.getParameter("w1");
	String ww2 = request.getParameter("w2");
	String s=" 1=1 ";
	if(!name.equals("")) s=s+" and name='"+name+"'";
	if(sex!=null) s=s+" and sex='"+sex+"'";
	float w1,w2;
	if(!ww1.equals("")){w1=Float.parseFloat(ww1);s=s+" and weight>="+w1;}
	if(!ww2.equals("")){w2=Float.parseFloat(ww2);s=s+" and weight<="+w2;}
	String sql="delete from stu_info where"+s;
	PreparedStatement stmt = conn.prepareStatement(sql);
	int n=stmt.executeUpdate();
	if(n==1){%>数据删除操作成功！<br><%}
	else{ %> 数据删除操作失败！<br><%}
	if(stmt!=null){stmt.close();}
	if(conn!=null){conn.close();}	
%>
</body>
</html>
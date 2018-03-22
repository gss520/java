<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改后重写记录页面</title>
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
	
	String sql = "update stu_info set id=?,name=?,sex=?,age=?,weight=?,hight=? where name=? and sex=?";
	PreparedStatement pstmt=conn.prepareStatement(sql);
	request.setCharacterEncoding("utf-8");
	int id=Integer.parseInt(request.getParameter("id"));
	String name2 = request.getParameter("name2");
	String sex2 = request.getParameter("sex2");
	int age = Integer.parseInt(request.getParameter("age"));
	float weight = Float.parseFloat(request.getParameter("weight"));
	float hight =Float.parseFloat(request.getParameter("hight"));
	String name = (String)session.getAttribute("name");
	String sex = (String)session.getAttribute("sex");
	pstmt.setInt(1,id);
	pstmt.setString(2,name2);
	pstmt.setString(3,sex2);
	pstmt.setInt(4,age);
	pstmt.setFloat(5,weight);
	pstmt.setFloat(6,hight);
	pstmt.setString(7,name);
	pstmt.setString(8,sex);
	int n = pstmt.executeUpdate();
	if(n>=1){%>重写数据操作成功！<br><%}
	else{ %>重写数据操作失败！<%=n %><br> <%}
	if(pstmt!=null){pstmt.close();}
	if(conn!=null){pstmt.close();}
	%>
</body>
</html>
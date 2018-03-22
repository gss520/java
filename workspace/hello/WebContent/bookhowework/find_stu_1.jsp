<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示所有学生的页面</title>
</head>
<body>
	<center>
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
		
		String sql="select * from stu_info";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		rs.last();
		%>你要查询的学生数据表中共有
		<font size="5" color="red"><%=rs.getRow() %></font>人
		<table border="2" bgcolor="ccceee" width="650">
			<tr bgcolor="cccccc" align="center">
				<td>记录条数</td>
				<td>学号</td>
				<td>姓名</td>
				<td>性别</td>
				<td>年龄</td>
				<td>体重</td>
				<td>身高</td>
		<%rs.beforeFirst();
		while(rs.next()){
		%><tr align="center">
			<td><%=rs.getRow() %></td>
			<td><%=rs.getString("id") %></td>
			<td><%=rs.getString("name") %></td>
			<td><%=rs.getString("sex") %></td>
			<td><%=rs.getString("age") %></td>
			<td><%=rs.getString("weight") %></td>
			<td><%=rs.getString("hight") %></td>
			<%} %>
		</table>
	</center>
	<%if(rs!=null){rs.close();} 
	  if(pstmt!=null){pstmt.close();}
	  if(conn!=null){conn.close();}
	%>
</body>
</html>
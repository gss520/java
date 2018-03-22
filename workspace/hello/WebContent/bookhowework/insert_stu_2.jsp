<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>对象添加一条记录页面</title>
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
		
		String sql ="Insert into stu_info(id,name,sex,age,weight,hight) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		request.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		int age = Integer.parseInt(request.getParameter("age"));
		float weight = Float.parseFloat(request.getParameter("weight"));
		float hight = Float.parseFloat(request.getParameter("hight"));
		
		pstmt.setInt(1,id);
		pstmt.setString(2,name);
		pstmt.setString(3,sex);
		pstmt.setInt(4,age);
		pstmt.setFloat(5,weight);
		pstmt.setFloat(6,hight);
		int n=pstmt.executeUpdate();
		if(n==1){%>数据插入操作成功！<br><%}
		else{ %>数据插入操作失败！<br><%}
		if(pstmt!=null){pstmt.close();}
		if(conn!=null){conn.close();}
	%>
</body>
</html>
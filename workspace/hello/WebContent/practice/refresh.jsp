<%@ page import="java.util.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	session创建的时间是：<%= new Date(session.getCreationTime()) %><br>
	sesson的ID号：<%=session.getId() %><br>
	客户最近一次的访问时间是：
	<%= new java.sql.Time(session.getLastAccessedTime()) %><br>
	两次请求间隔多长时间session将被取消（ms）：
	<%= session.getMaxInactiveInterval() %><br>
	是否是新创建的session:<%=session.isNew()?"是":"否" %>
	<hr>	
</body>
</html>
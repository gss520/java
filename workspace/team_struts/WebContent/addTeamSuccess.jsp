<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="bean.Team"
    pageEncoding="UTF-8"%>
<%
String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()
	+request.getContextPath()+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加小组成功</title>
</head>
<body>
	<h1 align="center">增加小组成功</h1>
	<%Team team = (Team)request.getAttribute("team"); %>
	<p>组名：<%=team.getName() %>
	<p>口号：<%=team.getSlogan() %>
	<p>组长：<%=team.getLeader() %>
	<p><a href="addTeam.html">继续增加</a>
	<a href="servlet/viewTeams">显示小组</a>
	<a href="addTeam.html">返回首页</a>
</body>
</html>
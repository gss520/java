<%@ page language="java" contentType="text/html; charset=UTF-8"
		import="business.TeamBusiness"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加小组</title>
</head>
<body>
	<%request.setCharacterEncoding("utf-8"); %>
	<jsp:useBean id ="team" class="bean.Team"/>
	<jsp:setProperty name="team" property="*"/>
		<%
		try{
			TeamBusiness.addTeam(team);
		%>
		<h1>增加小组成功</h1>
		<%}
			catch(Exception e){
				e.printStackTrace();
		%><h1>增加小组失败</h1>
		<%
			}
		%>
		<p><a href="addTeam.html">继续增加</a>
	
	<h1 align="center">显示小组</h1>
	<p>组名：<jsp:getProperty name="team" property="name"/>
	<p>口号：<jsp:getProperty name="team" property="slogan"/>
	<p>组长：<jsp:getProperty name="team" property="leader"/>
	<p><a href="addTeam.html">返回首页</a>
</body>
</html>
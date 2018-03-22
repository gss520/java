<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加小组信息</title>
</head>
<body>
	<form action="AddTeam.action" method="post">
		<p>组名：<input type="text" name="team.name">
		<p>口号：<input type="text" name="team.slogan">
		<p>组长：<input type="text" name="team.leader">
		<p><input type="submit" value="确定">
			<input type="reset" value="重填">
	</form>
</body>
</html>
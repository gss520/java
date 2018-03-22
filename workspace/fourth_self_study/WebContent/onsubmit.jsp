<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" conte
nt="text/html; charset=UTF-8">
<title>表单提交事件</title>
</head>
<body>
	<form name="teamForm" action="servlet/addTeam" method="post" 
		onSubmit="return confirm('你确定要提交吗？');">
		<p>组名：<input type="text" name="name">
		<p>口号：<input type="text" name="slogan">
		<p>组长：<input type="text" name="leader">
		<p><input type="submit" value="确定">
		<input type="reset" value="重填">
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加任意学生的提交页面</title>
</head>
<body>
	<form action="insert_stu_2.jsp" method="post">
		<table border="0" width="238" height="252">
			<tr><td>学号</td><td><input type="text" name="id"></td></tr>
			<tr><td>姓名</td><td><input type="text" name="name"></td></tr>
			<tr><td>性别</td><td><input type="text" name="sex"></td></tr>
			<tr><td>年龄</td><td><input type="text" name="age"></td></tr>
			<tr><td>体重</td><td><input type="text" name="weight"></td></tr>
			<tr><td>身高</td><td><input type="text" name="hight"></td></tr>
			<tr align="center">
				<td colspan="2">
					<input type="submit" value="提 交">&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="reset" value="取 消">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
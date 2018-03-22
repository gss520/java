<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>失去焦点</title>
</head>
<body>
	<h1>失去焦点事件</h1>
	<form name="f">
		<p><input type="text" name="t1" onBlur="alert('你填写的是：'+f.t1.value);"/>
		<p><input type="text" name="t2"/>
	</form>
</body>
</html>
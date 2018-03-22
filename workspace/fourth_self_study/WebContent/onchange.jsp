<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>内容改变事件</title>
</head>
<body>
	<h1 align="center">内容改变事件</h1>
	<form name="f">
		<select name="language" onChange="if(f.language.value='chinese')alert('你好！');if(f.language.value='english')alert('Hello');">
			<option value="">请选择语言
			<option value="chinese">中文
			<option value="english">English
		</select>
	</form>
</body>
</html>
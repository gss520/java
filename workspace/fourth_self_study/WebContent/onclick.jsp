<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>点击事件</title>
	<script type="text/javascript" language="javascript">
		var n=0;
		
	</script>
</head>
<body>
	<h1 align="center">点击事件</h1>
	<form name="f">
		<input type="text" name="t"/>
		<input type="button" value="请点击" onClick="n++;f.t.value='你点击了'+n+'次';"/>
	</form>
</body>
</html>
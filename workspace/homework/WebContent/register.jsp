<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>register</title>
<style type="text/css">
	<!--
		.background{
			background:url(images/banner.jpg);
			
		}
		font{
			color:white;
		}
	-->
</style>
</head>
<body>
		<h2 align="center">register</h2>
		<table  align="center" width="400" border="1" bordercolor="black" cellpadding="20" cellspacing="0" >
			<tr align="center" ><td>
		<div class=background>
		<form action="Insert" method="post">
			<font>
				number:<input type="text" name="userid"><br/><br/>
				password:<input type="password" name="userpwd"><br/><br/>
				again password:<input type="password"><br/><br/>
				sex:<input type="radio" name="sex"checked>male&nbsp;<input type="radio" name="sex">female<br/><br/>
				QQ:<input type="text" name="qq"><br/><br/>
				name:<input type="text" name="name"><br/><br/>
				ID-card:<input type="text" name="IDcard"><br/><br/>
				<input type="submit" value="register">&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="reset" value="cancel">
			</font>
		</form>
		</div>
		</td>
		</tr>
		</table>
</body>
</html>
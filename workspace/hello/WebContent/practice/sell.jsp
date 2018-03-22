<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>试题</title>
</head>
<body>
	<form action="show.jsp" method="post">
		一、2+3=？<br>
		<input type="radio" name="r1" value="2" checked="checked">2&nbsp;
		<input type="radio" name="r1" value="3" >3&nbsp;
		<input type="radio" name="r1" value="4" >4&nbsp;
		<input type="radio" name="r1" value="5" >5&nbsp;
		二、那个是偶数？<br>
		<input type="checkbox" name="c1" value="2" >2&nbsp;
		<input type="checkbox" name="c1" value="3" >3&nbsp;
		<input type="checkbox" name="c1" value="4" >4&nbsp;
		<input type="checkbox" name="c1" value="5" >5&nbsp;
		三、下列那些是动态网页？<br>
		<select size="4" name="list1" multiple="multiple">
			<option value="html">html</option>
			<option value="php">php</option>
			<option value="asp">asp</option>
			<option value="jsp">jsp</option>
			<option value="xyz" selected="selected">xyz</option>
		</select><br>
		四、下列组件哪些是服务器端的？
		<select>
			<option value="jsp">jsp</option>
			<option value="servlet">servlet</option>
			<option value="java">java</option>
			<option value="jdbc">jdbc</option>
		</select><br>
		五、在服务器端接收的用户请求对象的是：
		<input type="text" size="20" name="text1"><br>
		<div align="left">
			<blockquote>
				<input type="submit" value="提交" name="button1">
				<input type="reset" value="重置" name="button2">
				
			</blockquote>
		</div>
		
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>this is onepage</title>
</head>
<body>
	<h4>该页面传递一参数QQ，直线下是接受参数页面的内容</h4>
	<hr/>
	 <%request.setCharacterEncoding("utf-8"); 
	 	
	 %>
	 		<jsp:include page="onepage.jsp">
				<jsp:param name="userName" value="台湾"/>
			</jsp:include>
	 
		<jsp:forward page="onepage.jsp">
			<jsp:param name="userName" value="中国"/>
		</jsp:forward>
		

	
	  <form action="onepage.jsp" method="post">
			
			数值1：<input type="text" name="one"/>
			数值2：<input type="text" name="two"/>
			<input type="submit" value="submit"/>
		</form>
		
	
</body>
</html>
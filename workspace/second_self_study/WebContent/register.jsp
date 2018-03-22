<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>处理表单</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");//设置接收的字符
	
	//request接收表单数据
	String name = request.getParameter("name");
	String pass = request.getParameter("pass");
	String gender = request.getParameter("gender");
	String[] hobby = request.getParameterValues("hobby");
	String class1 = request.getParameter("class");
	String introduce = request.getParameter("introduce");


	//把数组hobby拼接成一个字符串s_hobby
	String s_hobby = "";
	if(hobby!=null){
		for(int i=0;i<hobby.length;i++){
			s_hobby = s_hobby+hobby[i];
			//如果不是最后一个数组元素，加一个逗号做分隔符
			if(i<hobby.length-1){
				s_hobby = s_hobby+",";
			}
		}
	}
	
	%>
	<h1 align=center>你好!</h1>
	<p>姓名：<%=name %>
	<p>密码：<%=pass%>
	<p>性别：<%=gender %>
	<p>爱好：<%=s_hobby%>
	<p>班级：<%=class1%>
	<p>自我介绍：
	<p><%=introduce%>
	
	
	<%-- <p>IP地址：<%=request.getRemoteAddr() %>
	<p>名称：<%=request.getRemoteHost() %>
	<% session.setAttribute("name",name); %>
	<jsp:forward page="hello.jsp" />
	 --%>
</body>
</html>
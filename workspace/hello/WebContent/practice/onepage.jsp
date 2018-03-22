<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>接受参数，并显示页面</title>
</head>
<body>
	<% 
	request.setCharacterEncoding("utf-8");
	String str = request.getParameter("userName");  
	String str1 = request.getRemoteAddr();
	String str2 = request.getRequestURI();
	Enumeration params = request.getParameterNames();
	while(params.hasMoreElements()){
	String sc_params = (String)params.nextElement();
	String sc_a = request.getParameter(sc_params);
	%>参数<%=sc_params %>
	<%} %>
	<font color="blue" size="12"><%=str+"  "+str1+"  "+str2+" guo " %></font>hello,welcome!
</body>
</html>
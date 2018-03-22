<%@ page import="java.util.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% String s1= request.getParameter("r1");
		if(s1!=null){
			out.println("一、解答为：2+3="+s1+"  ");
			if(s1.equals("5"))out.println("正确"+"<br>");
			else out.println("错误"+"<br>");
			
		}else out.println("没有答案"+"<br>");
		out.println("---------------------------------------<br>");

		 String[] s21 = request.getParameterValues("c1");
			if(s21!=null){
				out.println("二、解答为：偶数有："+"<br>");
				for(int i=0;i<s21.length;++i){
					out.println(s21[i]+"   ");
				}
			if(s21.length == 2&&s21[0].equals("2")&&s21[1].equals("4"))
				out.println("正确"+"<br>");
			else out.println("错误"+"<br>");
			}else out.println("二、没有答案"+"<br>");
			out.println("---------------------------------------<br>");

		%>
</body>
</html>
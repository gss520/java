<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		import="java.util.Collection"
		import="bean.Team"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示小组</title>
</head>
<body>
	<table border="1" align="center">
		<tr><th>组名</th><th>口号</th><th>组长</th></tr>
		<%
			Collection<Team>teams = (Collection<Team>)request.getAttribute("teams");
			Iterator<Team> it = teams.iterator();
			while(it.hasNext()){
				Team team = it.next();
				%>
				<tr>
					<td><%=team.getName() %></td>
					<td><%=team.getSlogan() %></td>
					<td><%=team.getLeader() %></td>
				</tr>
		<%
			}
		
		%>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>land</title>
<style type="text/css">
	<!--
		.land{
			margin-top:200px;
			height:100%;
			width:100%;
			align:center;
			background:url(images/land.jpg);
		}
		font{
		color:white;
		}
	-->
</style>
</head>
	<body>
		<div class="land">
			<font>
			<h2 align="center">LAND</h2>	
			<table align="center" width="400" border="1" bordercolor="black" cellpadding="20" cellspacing="0" >
				<tr align="center" >
					<td>
						<form action="" name="form1" align="center" width="600px" border="1"  method="post">
							number:<input type="text" name="userid" onclick="mes.inner" HTML="" value="${param.userid}"><br/><br/>
							password:<input type="password" name="userpwd" value="${param.userpwd}"><br/><br/>
							Verification Code:<input type="text" name="checkcode"/>
							<br/><br/>
							<img border="0" src="checkcode"/>
							<input value="换一张" type="submit" onclick="form1.action='changecheckcode'"/>
								<br/><br/>
							<input type="submit" value="Login"  onclick="form1.action='Logcheck'"/>&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="reset" value="RESET"/><br/><br/>
							<div id="mes">${info}</div> 
						</form>
					</td>
				</tr>
			</table>
			</font>
		</div>
</body>
</html>
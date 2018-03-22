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
			height:400px;
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
			<h2 align=center>LAND</h2>	
			<table  align="center" width="400" border="1" bordercolor="black" cellpadding="20" cellspacing="0" >
				<tr align="center" >
					<td>
						<form align="center" width="600px" border="1"  action="index.html">
							number:<input type="text" name="zhanghao" onclick="mes.innerHTML=" value="${param.userid}"><br/><br/>
							password:<input type="password" name="userpwd" value="${param.userpwd}"><br/><br/>
							Verification Code:<input type="text" name="vc"/>
							<img border="0" src="checkcode"/>
							<input type="submtit" value="换一张" onclick="form1.action='changecheckcode'"/>
							<br/>
							<input type="submit" value="LAND"/>
							<input type="reset" value="RESET"/>
							<div id="mes">${info}</div>
						</form>
					</td>
				</tr>
			</table>
			</font>
		</div>
</body>
</html>
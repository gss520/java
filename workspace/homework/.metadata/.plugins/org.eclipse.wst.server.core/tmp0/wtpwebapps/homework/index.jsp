<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>perrier</title>
	<style type="text/css">
		#div1, #div2
		{float:left; width:198px; height:66px; margin:10px;padding:10px;border:1px solid #aaaaaa;}
	</style>
	<script type="text/javascript">
		function allowDrop(ev)
		{
		ev.preventDefault();
		}
		
		function drag(ev)
		{
		ev.dataTransfer.setData("Text",ev.target.id);
		}
		
		function drop(ev)
		{
		ev.preventDefault();
		var data=ev.dataTransfer.getData("Text");
		ev.target.appendChild(document.getElementById(data));
		}
	</script>
</head>
<body>
<div id="div1" ondrop="drop(event)" ondragover="allowDrop(event)">
  <img src="/i/eg_dragdrop_w3school.gif" draggable="true" ondragstart="drag(event)" id="drag1" />
</div>
<div id="div2" ondrop="drop(event)" ondragover="allowDrop(event)"></div>

</body>
</html>
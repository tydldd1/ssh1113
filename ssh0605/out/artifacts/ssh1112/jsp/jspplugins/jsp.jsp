<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<base href="<%=basePath%>">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		
		<!--<link rel="stylesheet" type="text/css" href="styles.css">-->
		<!--<script type="text/javascript" src="js/jQuery1.9.1-min.js"></script>-->
	</head>
	
	<body>
		
		<script type="text/javascript">
			$(function(){
			});
		</script>
		
		<div id="id">
			<input  name="in"/>
		</div>

	</body>
</html>
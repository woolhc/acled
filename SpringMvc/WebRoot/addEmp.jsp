<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'addEmp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <form action="${pageContext.request.contextPath }/add.action" method="POST">
  	<table border="2" align="center">
  		<tr>
  			<th>姓名</th>
  			<td><input type="text" name="username"/></td>
  		</tr>
  		<tr>
  			<th>性别</th>
  			<td>
  				<input type="radio" name="gender" value="男"/>男
  				<input type="radio" name="gender" value="女" checked="checked">女
  			</td>
  		</tr>
 		 <tr>
  			<th>入职时间</th>
  			<td>
  			 <input type="text" name="hiredate" value="2015-5-10" >
  			</td>
  		</tr>
  		<tr>
  			<td colspan="2" align="center">
  				<input type="submit" value="提交"/>
  			</td>
  		</tr>
  	</table>
  </form>
  </body>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>演示映射器</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style>
		.no_underline{
			text-decoration: none
		}
    </style>
  </head>
  
  <body>
    <a href="${pageContext.request.contextPath }/add.action" class="no_underline">增加用户</a><br>
    <a href="${pageContext.request.contextPath }/update.action">修改用户</a><br>
    <a href="${pageContext.request.contextPath }/delete.action">删除用户</a><br>
    <a href="${pageContext.request.contextPath }/find.action">查询用户</a><br>
  </body>
</html>

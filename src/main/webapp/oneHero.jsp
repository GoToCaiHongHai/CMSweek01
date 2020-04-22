<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="g" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>详细信息页面</h1>
	英雄名称:<input value="${hero.hname }"><br>
	英雄阵营:<input value="${camp.cname}"><br>
	英雄价格:<input value="${hero.price }"><br>
	是否拥有:<input value="${hero.have==0?'未拥有':'已拥有' }"><br>
	<a href="show">返回</a>
</body>
</html>
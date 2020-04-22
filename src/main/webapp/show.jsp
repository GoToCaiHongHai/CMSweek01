<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="g"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/table.css">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<h1>英雄展示页面</h1>
	<hr>
	<a href="addHero.jsp"><button>添加英雄</button></a>
	<form action="show">
		阵营:<select name="cid">
			<option>请选择</option>
			<g:forEach items="${camplist }" var="camp">
				<option value="${camp.cid }" <g:if test="${camp.cid==map.cid }">selected="selected"</g:if>>${camp.cname }</option>
			</g:forEach>
			</select>
		&nbsp;
		价格:<input type="text" name="minPrice" value="${map.minPrice }">
		~
			<input type="text" name="maxPrice" value="${map.maxPrice }">
		&nbsp;
		是否拥有:<select name="have">
				<option>请选择</option>
				<option value="0" <g:if test="${map.have==0 }">selected="selected"</g:if>>未拥有</option>
				<option value="1" <g:if test="${map.have==1 }">selected="selected"</g:if>>已拥有</option>
			</select>
		&nbsp;
		<input type="submit" value="查询">
	</form>
	<table>
		<tr>
			<th>名称</th>
			<th>阵营</th>
			<th>价格</th>
			<th>是否拥有</th>
			<th>操作</th>
		</tr>
		<g:forEach items="${plist.list }" var="d">
			<tr>
				<td>${d.hname }</td>
				<td>${d.camp.cname }</td>
				<td>${d.price }</td>
				<td>${d.have==0?"未拥有":"已拥有" }</td>
				<td>
					<button class="xq" value="${d.hid }">详情</button>
					<button class="gm" value="${d.hid }">购买</button>
				</td>
			</tr>
		</g:forEach>
	</table>
	<a href="show?pageNum=${plist.firstPage }">首页</a>
	<a href="show?pageNum=${plist.prePage }">上一页</a>
	<a href="show?pageNum=${plist.nextPage }">下一页</a>
	<a href="show?pageNum=${plist.lastPage }">尾页</a>
</body>
	<script type="text/javascript">
		$(".gm").click(function(){
			var hid=$(this).val();
			if(hid==1){
				alert("已拥有当前英雄");
				return;
			}
			$.post("update",{"hid":hid},function(back){
				if(back>0){
					alert("购买成功");
					location.href="show";
				}
			},"json")
		})
		
		$(".xq").click(function(){
			location.href="selectOne?hid="+$(this).val();
		})
	</script>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<h1>添加英雄页面</h1>
	<form action="addHero">
		英雄名称:<input type="text" name="hname"><br>
		英雄价格:<input type="text" name="price"><br>
		英雄阵营:<select name="camp.cid">
				<option>请选择</option>
			</select><br>
		是否拥有:<select name="have">
				<option>请选择</option>
				<option value="0">未拥有</option>
				<option value="1">已拥有</option>
			</select><br>
		<input type="submit" value="提交">
	</form>
</body>

	<script type="text/javascript">
		$.post("selectCamp",{},function(back){
			for(var i in back){
				$("[name='camp.cid']").append("<option value='"+back[i].cid+"'>"+back[i].cname+"</option>");
			}
		},"json")
	</script>

</html>
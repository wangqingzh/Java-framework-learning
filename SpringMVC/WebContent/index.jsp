<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>
	<a href="welcome/zz">springmvc</a>
	<form action="welcome/zz" method="get">
		<!-- <input name="username" /> -->
		<input name="age" />
		<input type="submit" name="su" />
	</form><br />
	<a href="testCookieValue">testCookieValue</a><br />
	<a href="testModelAndView">testModelAndView</a><br />
	<a href="testModelMap">testModelMap</a><br />
	<a href="testModel">testModel</a><br />
	<a href="testMap">testMap</a>
	
	<br/>testModelAttribute:
	<form action="testModelAttribute" method="get">
		<input type="hidden" name="stuId" value="23" />
		<input name="stuName" />
		<input type="submit" name="su" />
	</form><br />
	
	<a href="testDirectVisit">testDirectVisit</a>
	<a href="testForward">testForward</a>
	<a href="testReDirect">testReDirect</a>
	<a href="testTypeConversion/88">testTypeConversion</a>
	<form action="testConverter" >
		<input type="text" name="studentInfo"/>
		<input type="submit" value="提交" />
	</form>
	<br>
	<form action="testDateTimeFormat" >
		学号：<input type="text" name="stuId"/><br>
		姓名：<input type="text" name="stuName"/><br>
		出生日期：<input type="text" name="birthday"/><br>
		<input type="submit" value="提交" />
	</form>
	<button id="testJson">testJson</button>
	<br>
	<form action="testFileUpload" method="post" enctype="multipart/form-data">
		<input type="file" name="file" />
		描述：<input name="desc" />
		<input type="submit" value="上传">
	
	</form>
</body>
<script type="text/javascript" src="js/jquery-1.12.4.js" ></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#testJson").click(function(){
			$.post(
				"testJson",
				function(){
					
				}
			);
		});
	});
</script>
</html>
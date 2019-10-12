<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ERROR</title>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<link rel="stylesheet" href="css/bootstrap.css" />
<script type="text/javascript">
	$(document).ready(function(){
		setTimeout(function(){
			alert("跳转到结果分析界面！");
			location.href="resultController";
	},2000);
	});
</script>
<style type="text/css">
	.remind{
		margin-top:80px;
	}
</style>
</head>
<body>
	<div class="container-fluid">
		
		<div class="row	remind">
			<div class="col-md-4 col-md-offset-4 text-center">
				<h1>您已投过票，请勿重复投票</h1>
			</div>
			<div class="col-md-4 col-md-offset-4 text-center">
				<h1>您已投过票，请勿重复投票</h1>
			</div>
		</div>
	</div>
	
</body>
</html>
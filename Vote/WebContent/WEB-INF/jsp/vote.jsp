<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>vote</title>
	<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<link rel="stylesheet" href="css/bootstrap.css" />
	<style type="text/css">
		.tdleft {
			width: 30%
		}
	</style>
</head>
<script type="text/javascript">
	$("document").ready(function(){
		if("${requestScope['voteStatus']}" == "1"){
			$("#form").attr("action","updateVote");
			var $input = $('<input class="btn btn-primary" type="submit"  value="重新投票" /> <a class="btn btn-success" href="resultController">查看分析</a>');
			$input.appendTo($("#dybtn"));
		}else{
			var $input = $('<input class="btn btn-primary" type="submit" value="投票" />');
			$input.appendTo($("#dybtn"));
		}
	});
</script>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-offset-3 col-md-6 text-center">
				<h1 class="page-header">粽子口味之 咸党 vs 甜党</h1>
				<a class="pull-right" href="logout">退出登录</a>
			</div>
		</div>
		<div class="row" style="margin-top: 50px">
			<div class="col-md-offset-3 col-md-3">
				<img src="images/zongzi.png" class="img-thumbnail img-responsive" alt="Responsive image"></div>
			<div class="col-md-3">
				<form class="form-horizontal" id="form" action="vote" method="get">
					<input type="hidden" name="userId" value="" />
					<table class="table table-bordered">
						<tbody>
							<tr>
								<td class="tdleft" align="right">性别</td>
								<td>
									<label radio-inline>
										<input type="radio" name="sex" value="m" checked>男
									</label>
									<label radio-inline>
										<input type="radio" name="sex" value="f">女
									</label>
								</td>
							</tr>
							<tr>
								<td class="tdleft" align="right">年龄</td>
								<td>
									<label radio-inline>
										<input type="radio" name="age" value="a" checked>20岁以下
									</label>
									<label radio-inline>
										<input type="radio" name="age" value="b">20-35岁
									</label>
									<label radio-inline>
										<input type="radio" name="age" value="c">35-50岁
									</label>
									<label radio-inline>
										<input type="radio" name="age" value="d">50岁以上
									</label>
								</td>
							</tr>
							<tr>
								<td class="tdleft"></td>
								<td>
									<label radio-inline>
										<input type="radio" name="vote" value="salty" checked>我是咸党
									</label>
									<label radio-inline>
										<input type="radio" name="vote" value="sweet">我是甜党
									</label>
								</td>
							</tr>
							<tr>
								<td class="tdleft"></td>
								<td id="dybtn">
									
								</td>
							</tr>
						</tbody>
					</table>
				</form>
			</div>
		</div>
	</div>

</body>

</html>
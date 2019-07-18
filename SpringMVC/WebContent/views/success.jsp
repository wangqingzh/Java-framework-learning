<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	success<br />
	student1:<br />${requestScope.student1.stuId} -- ${requestScope.student1.stuName}<br>
	${sessionScope.student1.stuId} -- ${sessionScope.student1.stuName}<br>
	student2:<br />${requestScope.student2.stuId} -- ${requestScope.student2.stuName}<br>
	${sessionScope.student2.stuId} -- ${sessionScope.student2.stuName}<br>
	student3:<br />${requestScope.student3.stuId} -- ${requestScope.student3.stuName}<br>
	${sessionScope.student3.stuId} -- ${sessionScope.student3.stuName}<br>
	student4:<br />${requestScope.student4.stuId} -- ${requestScope.student4.stuName}<br>
	${sessionScope.student4.stuId} -- ${sessionScope.student4.stuName}<br>
	<br/>student:<br />${requestScope.student.stuId} -- ${requestScope.student.stuName}<br>
	${sessionScope.student.stuId} -- ${sessionScope.student.stuName}<br>
</body>
</html>
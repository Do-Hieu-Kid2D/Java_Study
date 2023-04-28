<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index.jsp</title>
</head>
<body>
	<%
	String mes = request.getParameter("message");
	%>
	<h1> Hé Lô bà già -> servlet vừa chuyển tiếp tới trang này nha!</h1>
	<h2> <%=mes %></h2>
	<h3> ${message}</h3>
</body>
</html>
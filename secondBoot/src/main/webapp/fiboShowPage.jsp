<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h2>
<c:forEach items="${myfibo}" var="num">
<p>${num} </p>
</c:forEach>
</h2>
<h3>
<a href="/index">Return</a>
</h3>
</div>

</body>
</html>
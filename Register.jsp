<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-dark">
			<div class="container-fluid">
				<nav class="navbar navbar-light bg-light">
					<div class="container">
						<a class="navbar-brand" href="#"> <img
							src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSUtavIeb1kN6QGxUKZ-24c9teBzh11P0SxVQ&usqp=CAU"
							alt="" width="88" height="48">
						
					</div>
					</div>
					<a href="index.jsp">index</a></br>
						<a href="Search.jsp">search</a>
					</nav>				

<c:forEach items="${error}" var="e">
<h6 style="color:red;">${e.message}</h6>
</c:forEach>
<form action="register" method="post">
<pre>
companyName<input type="text" name="companyName"/>
name<input type="text" name="name"/>
cost<input type="text" name="cost"/>
<select name="type">
<option value="">select</option>
<c:forEach items="${type}" var="t">
<option value="${t}">${t}</option>
</c:forEach>
</select>

<select name="country">
<option value="">select</option>
<c:forEach items="${country}" var="c">
<option value="${c}">${c}</option>
</c:forEach>
</select>
<input type="submit" value="save"/>
</pre>
</form>

		
</body>
</html>
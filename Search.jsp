<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<a href="register">Register page</a><br>
<h1>aeroplane search</h1>
<h3><span style="color:red;">${message}</span></h3>
<form action="search" method="get">
search by id<input type="text" name="id"/>
<input type="submit" value="search">
</form>
<div>
<h3>search details:</h3>
<pre>
company:${dto.companyName}</br>
name:${dto.name}
cost:${dto.cost}
type:${dto.type}
country:${dto.country}
</pre>
</div>
</
</body>
</html>
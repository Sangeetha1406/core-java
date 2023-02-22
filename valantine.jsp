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

<h1>welcome to valantine data saving</h1>

<c:forEach items="${error}" var="e">
<h6 style="color:red;">${e.message}</h6>
</c:forEach>
<form action="valantine" method="post">
<pre>
name<input type="text" name="name"/>
valentineName<input type="text" name="valentineName"/>
mettingPlace<select name="mettingPlace">
<option value=""></option>
<c:forEach items="${places}" var="p">
<option value="${p}">${p}</option>
</c:forEach>
</select>
gift<select name="gift">
<option value=""></option>
<c:forEach items="${gifts}" var="g">
<option value="${g}">${g}</option>
</c:forEach>
</select>
<input type="submit" value="save"/>
</pre>
</form>

</body>
</html>
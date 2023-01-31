<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>send details of fav person</h1>
<form action="jspcalling" method="post">
<pre>
FirstName:<input type="text" name="fName"/>
LastName:<input type="text" name="lName"/>
Gender Male:<input type="radio" name="gender" value="male"/>
		Female:<input type="radio" name="gender" value="female"/>
Reason:<textarea rows="5" columns="25" name="res"></textarea>
Address:<textarea rows="5" columns="25" name="addrs"></textarea>
<input type="submit" value="send">
</pre>
</body>
</html>
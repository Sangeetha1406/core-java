<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>x-workz</title>
</head>
<body>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
<nav class="navbar navbar bg-dark" data-bs-theme="dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"><img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt=" " width="80" height="48">
    </a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
        
     <a class="btn btn-outline-warning" href="interview.jsp">interview</a>
      </form>
</nav>


<h1>This is a company details</h1>

<form action="job" method="post">
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Name</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="enter your name" name="name">
</div>

<div>

<select class="form-select" aria-label="Default select example" name="company">
  <option selected>select Company</option>
  <option value="infosys">infosys</option>
  <option value="wipro">wipro</option>
  <option value="cognizant">cognizant</option>
</select>
</div>


<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label" >role</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" name="role" placeholder="enter a role">
</div>


<input type="submit" class="btn btn-danger" value="send">
</form>
</body>
</html>
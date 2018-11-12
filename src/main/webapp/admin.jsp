<%@taglib prefix="cc" uri="http://charlesclark.com/tags"%>
<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Admin page</title>
</head>
<body>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">

        </div>
        <ul class="nav navbar-nav">
            <li class="index.jsp"><a href="index.jsp">Home</a></li>
            <li><a href="weather.jsp">Weather</a></li>
            <li><a href="newEmployee.jsp">New Employee</a></li>
            <li><a href="admin.jsp">Administration</a></li>
        </ul>
    </div>
</nav>

<h2 class="center">Administration Page</h2>


<form action="search" class=form-inLine" method="get">
    <div class="form-group">
        <label for="searchTerm">Search by user id</label>
        <input type="text" class="form-control" id="searchTerm" name="searchTerm" >
    </div>
    <button type="submit" name="submit" value="search" class="btn btn-success btn-send">Search</button>

</form>
<br/>
<div class="logoutButton">
<a href="logout.jsp">Log out</a>
</div>

</body>
</html>

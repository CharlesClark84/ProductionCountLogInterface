<%@taglib prefix="cc" uri="http://charlesclark.com/tags"%>
<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Admin page</title>
</head>


<%@include file="navbar.jsp"%>

<h2 class="center">Administration Page</h2>


<form action="search" class=form-inLine" method="get">
    <div class="form-group">

        <label>Return all data</label>
    <button type="submit" name="submit" value="getAll"  class="btn btn-success btn-send">Get All</button><br/>

    <label for="id">Search by user id</label>
    <input type="text" class="form-control" id="Id" name="Id">

        <button type="submit" name="submit" value="id"  class="btn btn-success btn-send">Get by ID</button>

    </div>

</form>
<br/>
<div class="logoutButton">
<a href="logout.jsp">Log out</a>
</div>

</body>
</html>

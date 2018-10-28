<%@include file="head.jsp"%>
<html>
<head>
    <title>Log In</title>
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
<div class="well">
<h2>Log In</h2>
<FORM ACTION="j_security_check" METHOD="POST">
    <TABLE>
        <TR><TD>User name: <INPUT TYPE="TEXT" NAME="j_username">
        <TR><TD>Password: <INPUT TYPE="PASSWORD" NAME="j_password">
        <TR><TH><INPUT TYPE="SUBMIT" VALUE="Log In">
    </TABLE>
</FORM>
</div>
</body>
</html>

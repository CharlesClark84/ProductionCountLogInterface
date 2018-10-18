<%@include file="head.jsp"%>
<html>
<head>
    <title>New Employee Form</title>
</head>
<body>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">

        </div>
        <ul class="nav navbar-nav">
            <li class="index.jsp"><a href="index.jsp">Home</a></li>
            <li><a href="login.jsp">Login</a></li>
            <li><a href="newEmployee.jsp">New Employee</a></li>
            <li><a href="admin.jsp">Administration</a></li>
        </ul>
    </div>
</nav>

<h2>Register</h2>
<FORM ACTION="" METHOD="POST">
        <TR><TD>User name: <INPUT TYPE="TEXT" NAME="newEmployee">

            <input type="submit" class="btn btn-success btn-send" value="Submit">
            <input type="reset" value="Clear" />
</FORM>
</body>
</html>

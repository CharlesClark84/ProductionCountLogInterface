<%@include file="head.jsp"%>
<html>
<head>
    <title>Log In</title>
</head>
<body>

<%@include file="navbar.jsp"%>

<div class="well" id="loginForm">
<h2>Log In</h2>
<FORM ACTION="j_security_check" METHOD="POST">
    <TABLE>
        <TR><TD>User name: <INPUT TYPE="TEXT" NAME="j_username"><br/><br/>
        <TR><TD>Password: <INPUT TYPE="PASSWORD" NAME="j_password">
        <TR><TH><INPUT TYPE="SUBMIT" VALUE="Log In" class="btn btn-success btn-send" >
    </TABLE>
</FORM>
</div>
</body>
</html>

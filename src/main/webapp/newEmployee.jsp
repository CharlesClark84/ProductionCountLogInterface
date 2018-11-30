<%@include file="head.jsp"%>
<%@include file="navbar.jsp"%>
<html>
<head>
    <title>New Employee Form</title>
</head>
<body>



<div class="well">
<h2 class="center">Register Personal Info</h2>
<FORM  ACTION="newEmployee" METHOD="POST" id="employeeForm" class="center">
    <label class="control-label">First name:</label> <INPUT class="form-control" TYPE="TEXT" NAME="firstName"><br/><br/>
    <label class="control-label">Last name:</label> <INPUT class="form-control" TYPE="TEXT" NAME="lastName"><br/><br/>
    <label class="control-label">Address:</label> <INPUT class="form-control" TYPE="TEXT" NAME="address"><br/><br/>
    <label class="control-label">City</label> <INPUT class="form-control" TYPE="TEXT" NAME="city"><br/><br/>
    <label class="control-label">State</label> <INPUT class="form-control" TYPE="TEXT" NAME="state"><br/><br/>
    <label class="control-label">Zip</label> <INPUT class="form-control" TYPE="TEXT" NAME="zip"><br/><br/>
    <label class="control-label">Password:</label> <INPUT class="form-control" TYPE="TEXT" NAME="password"><br/><br/>

            <input type="submit" class="btn btn-success btn-send" value="Submit">
            <input type="reset" class="btn btn-primary" value="Clear" />
</FORM>
<br/>
<div class="logoutButton">
<a href="logout.jsp">Logout</a>
</div>
</div>
</body>
</html>

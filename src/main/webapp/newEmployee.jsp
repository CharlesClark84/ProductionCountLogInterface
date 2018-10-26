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
            <li><a href="weather.jsp">Weather</a></li>
            <li><a href="newEmployee.jsp">New Employee</a></li>
            <li><a href="admin.jsp">Administration</a></li>
        </ul>
    </div>
</nav>

<h2 class="center">Register Personal Info</h2>
<FORM  ACTION="newEmployee" METHOD="POST" id="employeeForm" class="center">
    <label class="control-label">First name:</label> <INPUT class="form-control" TYPE="TEXT" NAME="firstName"><br/><br/>
    <label class="control-label">Last name:</label> <INPUT class="form-control" TYPE="TEXT" NAME="lastName"><br/><br/>
    <label class="control-label">Address:</label> <INPUT class="form-control" TYPE="TEXT" NAME="address"><br/><br/>
    <label class="control-label">City</label> <INPUT class="form-control" TYPE="TEXT" NAME="city"><br/><br/>
    <label class="control-label">State</label> <INPUT class="form-control" TYPE="TEXT" NAME="state"><br/><br/>
    <label class="control-label">Zip</label> <INPUT class="form-control" TYPE="TEXT" NAME="zip"><br/><br/>
    <label class="control-label">password:</label> <INPUT class="form-control" TYPE="TEXT" NAME="password"><br/><br/>

            <input type="submit" class="btn btn-success btn-send" value="Submit">
            <input type="reset" value="Clear" />
</FORM>
</body>
</html>

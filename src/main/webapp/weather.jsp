<%@include file="head.jsp"%>
<html>
<head>
    <title>Weather</title>
</head>
<body>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">

        </div>
        <ul class="nav navbar-nav center-justify">
            <li class="index.jsp"><a href="index.jsp">Home</a></li>
            <li><a href="weather.jsp">Weather</a></li>
            <li><a href="newEmployee.jsp">New Employee</a></li>
            <li><a href="admin.jsp">Administration</a></li>
        </ul>
    </div>
</nav>
<div class="well">
<h2 class="center">Weather Check</h2>
<FORM  ACTION="weather" METHOD="POST" id="weatherForm" class="center">
    <label class="control-label">Employee Number:</label> <INPUT class="form-control" TYPE="TEXT" NAME="employeeNumber"><br/><br/>
    <label class="control-label">Confirm</label> <select class="form-control" name= "confirm">
    <option value="yes">Yes</option>
    <option value="no">No</option>
</select><br/><br/>
    <label class="control-label">Date:</label> <input class="form-control" type="date" name="date" id="date" required /><br /><br />



    <input type="submit" class="btn btn-success btn-send" value="Submit">
    <input type="reset" value="Clear" />
</FORM>
</div>
</body>
</html>

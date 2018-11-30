<%@include file="head.jsp"%>
<html>
<head>
    <title>Weather</title>
    <script src="ajaxParams.js" charset="utf-8"></script>
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

<div class="container">
    <div class="row well">

<br/><h2 class="center">Weather Check</h2><br/>
<form class="center">
    <label>Enter Zip Code:</label>
    <input type="text" name="zip" id="zip">
    <button type="button" id="getMessage" class="btn btn-primary">Get Weather</button>
</form>
<br/>

        <div class="well background" id="weatherResults"><div class="bold">Weather results</div><br/>
    <div id="content"></div>
    <div id="content2"></div>
    <div id="content3"></div>
    <div id="content4"></div>
    <div id="content5"></div>
    <div id="content6"></div>
    <div id="content7"></div>
    <div id="content8"></div>
    <div id="content9"></div>
    <div id="content10"></div>
    <div id="content11"></div>
            <br/><div id="tpm"><div class="bold">Preventative Maintenance</div><br/></div>
    <div id="wind"></div>
    <div id="temp"></div>
    <div id="glue"></div>

</div>




<h2 class="center">Weather Confirm</h2>
<FORM  ACTION="weather" METHOD="POST" id="weatherForm" class="center">
    <label class="control-label">Employee Number:</label> <INPUT class="form-control" TYPE="TEXT" NAME="employeeNumber"><br/><br/>
    <label class="control-label">Confirm</label> <select class="form-control" name= "confirm">
    <option value="yes">Yes</option>
    <option value="no">No</option>
</select><br/><br/>
    <label class="control-label">Date:</label> <input class="form-control" type="date" name="date" id="date" required /><br /><br />



    <input type="submit" class="btn btn-success btn-send" value="Submit">
    <input type="reset" class="btn btn-primary" value="Clear" />
</FORM>
    </div></div><%--end container and well--%>
</body>
</html>
<script type="text/javascript">
    init();
</script>


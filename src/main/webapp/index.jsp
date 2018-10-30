<%@taglib prefix="cc" uri="http://charlesclark.com/tags"%>
<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html>
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

<div class="container">



        <h2 class="center">Mach Production Form</h2>
<FORM action="echo" onsubmit="return validateForm()" method="post">

    <div class="form-group">
    <div class="col-xl-6">

    <fieldset>
        <label>Shift Information</label><br/><br/>

        <label class="control-label">Date:</label> <input class="form-control" type="date" name="date" id="date" required /><br /><br />

        <label class="control-label">Shift:</label> <input class="form-control" type="text" name="shift" id="shift" required/><br /><br />

        <label class="control-label">Employee Id</label>: <input class="form-control" type="text" name="employeeId" required /><br /><br />

        <label class="control-label">Product Name</label> <select class="form-control" name= "productName">
        <option value="213 Air filter">213 Air filter</option>
        <option value="410 Air filter">410 Air filter</option>
        <option value="413 Air filter">413 Air filter</option>
        <option value="501 Air filter">501 Air filter</option>
        <option value="513 Air filter">501 Air filter</option>
        </select><br/><br/>

        <label class="control-label">Machine Number:</label> <input class="form-control" type="text" name="machineNumber" required /><br /><br />

        <label class="control-label">Hours Worked:</label> <input class="form-control" type="text" name="hoursWorked" required /><br /><br />

        <label class="control-label">Total Parts:</label> <input class="form-control" type="text" name="totalParts" required /><br /><br />

    </fieldset></div>

    <div class="col-xl-6">
        <div class="form-group">

    <fieldset>
        <label>Credits</label><br/><br/>

        <label class="control-label">Downtime:</label> <input class="form-control" type="text" name="downtime" required /><br /><br />

        <label class="control-label">Bad Parts:</label> <input class="form-control" type="text" name="badParts" required /> x 0.002<br /><br />

        <label class="control-label">Ribbon Change:</label> <input class="form-control" type="text" name="ribbonChange" required /> x 0.200<br /><br />

        <label class="control-label">Glue Test:</label> <input class="form-control"type="text" name="glueTest" required /> x 0.100<br /><br />

        <label class="control-label">Full Skid:</label> <input class="form-control" type="text" name="fullSkid" required /> x 0.150<br /><br />

        <label class="control-label">Trash:</label> <input class="form-control" type="text" name="trash" required /> x 0.005<br /><br />

    </fieldset>

    <fieldset>
        <label>Shift Comments</label><br/><br/>
        <textarea rows="5" cols="30" name="comment" class="form-control" placeholder="Enter shift comments"></textarea><br/><br/>
    </fieldset>
            <input type="submit" class="btn btn-success btn-send" value="Submit">
        <input type="reset" value="Clear" />
        </div></div></div>
</FORM>
   </div></div>

</body>
</html>
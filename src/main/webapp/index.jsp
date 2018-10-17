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
            <li><a href="login.jsp">Login</a></li>
            <li><a href="newEmployee.jsp">New Employee</a></li>
            <li><a href="admin.jsp">Administration</a></li>
        </ul>
    </div>
</nav>

    <title>User Input Form</title>
</head>



<div class="container">

        <div class="form-group">
        <h2>Mach Production Form</h2>
<div  action="echo" onsubmit="return validateForm()" method="post">
    <div class="col-lg-6">

    <fieldset>
        <label>Shift Information</label><br/><br/>

        Date: <input type="date" name="date" id="date" required /><br /><br />

        Shift: <input type="text" name="shift" id="shift" required/><br /><br />

        Employee Id: <input type="text" name="employeeId" required /><br /><br />

        First Name: <input type="text" name="firstName" required /><br /><br />

        Last Name: <input type="text" name="lastName" required /><br /><br />

        Product Name <select name= "productName">
        <option value="213 Air filter">213 Air filter</option>
        <option value="410 Air filter">410 Air filter</option>
        <option value="413 Air filter">413 Air filter</option>
        <option value="501 Air filter">501 Air filter</option>
        <option value="513 Air filter">501 Air filter</option>
        </select><br/><br/>

        Machine Number: <input type="text" name="machineNumber" required /><br /><br />

        Hours Worked: <input type="text" name="hoursWorked" required /><br /><br />

        Total Parts: <input type="text" name="totalParts" required /><br /><br />

        Downtime: <input type="text" name="downtime" required /><br /><br />

    </fieldset>
    </div></div>

    <div class="col-lg-6">
        <div class="form-group">
    <fieldset>
        <label>Credits</label><br/><br/>

        Bad Parts: <input type="text" name="badParts" required /> x 0.002<br /><br />

        Ribbon Change: <input type="text" name="ribbonChange" required /> x 0.200<br /><br />

        Glue Test: <input type="text" name="glueTest" required /> x 0.100<br /><br />

        Full Skid: <input type="text" name="fullSkid" required /> x 0.150<br /><br />

        Trash: <input type="text" name="trash" required /> x 0.005<br /><br />

    </fieldset>

    <fieldset>
        <label>Shift Comments</label><br/><br/>
        <textarea rows="5" cols="30" name="comment" placeholder="Enter shift comments"></textarea><br/><br/>
    </fieldset>
        <input type="submit" class="btn btn-success btn-send" value="Submit">
        <input type="reset" value="Clear" />
    </div>
</form>

    </div></div></div>

</body>

</html>
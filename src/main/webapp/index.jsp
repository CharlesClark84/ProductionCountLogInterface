<%@taglib prefix="cc" uri="http://charlesclark.com/tags"%>
<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html>
<body>
<h2><cc:Greeting/></h2>


    <title>User Input Form</title>
</head>



<div class="container">
    <div class="row">
        <h2>Mach Production Form</h2>
<form name="form"  action="echo" onsubmit="return validateForm()" method="get">
    <div class="col-lg-6">

    <fieldset>
        <label>Shift Information</label><br/><br/>

        Date: <input type="date" name="date" id="date" required /><br /><br />

        Shift: <input type="text" name="shift" id="shift" required/><br /><br />

        Employee Id: <input type="text" name="employeeId" required /><br /><br />

        First Name: <input type="text" name="firstName" required /><br /><br />

        Last Name: <input type="text" name="lastName" required /><br /><br />

        Product Name <select name= "productName">
        <option value="1">213 Air filter</option>
        <option value="2">410 Air filter</option>
        <option value="3">413 Air filter</option>
        <option value="4">501 Air filter</option>
        <option value="5">513 Air filter</option>
        </select><br/><br/>

        Machine Number: <input type="text" name="machineNumber" required /><br /><br />

        Hours Worked: <input type="text" name="hoursWorked" required /><br /><br />

        Total Parts: <input type="text" name="totalParts" required /><br /><br />

        Downtime: <input type="text" name="downtime" required /><br /><br />

    </fieldset>
    </div>

    <div class="col-lg-6">
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
        <textarea rows="5" cols="30" name="instruction" placeholder="Enter shift comments"></textarea><br/><br/>
    </fieldset>
        <input type="submit" class="btn btn-success btn-send" value="Submit">
        <input type="reset" value="Clear" />
    </div>
</form>

</div></div>

</body>

</html>
<%@taglib prefix="cc" uri="http://charlesclark.com/tags"%>

<html>
<body>
<h2><cc:Greeting/></h2>
</body>
</html>

    <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
    <link rel="stylesheet" href="style.css">
    <title>User Input Form</title>
</head>

<body>
<h2>Mach Production Form</h2>
<form method="get" action="echo">
    <fieldset>
        <legend>Personal Information</legend>

        Date: <input type="text" name="date" value="" /><br /><br />

        Shift: <input type="text" name="shift" /><br /><br />

        Employee Id: <input type="text" name="employeeId" /><br /><br />

        First Name: <input type="text" name="firstName" /><br /><br />

        Last Name: <input type="text" name="lastName" /><br /><br />

        Product Name <select name = "productName">
        <option value="1">213 Air filter</option>
        <option value="2">410 Air filter</option>
        <option value="3">413 Air filter</option>
        <option value="4">501 Air filter</option>
        <option value="5">513 Air filter</option>
        </select><br/><br/>

        Machine Number: <input type="text" name="machineNumber" /><br /><br />

        Hours Worked: <input type="text" name="hoursWorked" /><br /><br />

        Total Parts: <input type="text" name="totalParts" /><br /><br />

        Downtime: <input type="text" name="downtime" /><br /><br />

    </fieldset>

    <fieldset>
        <legend>Credits</legend>

        Bad Parts: <input type="text" name="badParts" /><br /><br />

        Ribbon Change: <input type="text" name="ribbonChange" /><br /><br />

        Glue Test: <input type="text" name="glueTest" /><br /><br />

        Full Skid: <input type="text" name="fullSkid" /><br /><br />

        Trash: <input type="text" name="trash" /><br /><br />

    </fieldset>


    <fieldset>
        <legend>Shift Comments</legend>
        <textarea rows="5" cols="30" name="instruction" placeholder="Enter shift comments"></textarea>
    </fieldset>
    <br />

    <input type="submit" value="SEND" />
    <input type="reset" value="CLEAR" />
</form>
<hr />

</body>
</html>
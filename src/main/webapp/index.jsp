<%@taglib prefix="cc" uri="http://charlesclark.com/tags"%>

<html>
<body>
<h2><cc:Greeting/></h2>
</body>
</html>

    <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="style.css">
    <title>User Input Form</title>
</head>

<body>

<div class="container">
    <div class="row">
        <h2>Mach Production Form</h2>
<form method="get" action="echo" style="border: 2px solid grey">
    <div class="col-md-6">

    <fieldset>
        <label>Shift Information</label><br/><br/>

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
    </div>

    <div class="col-md-6">
    <fieldset>
        <label>Credits</label><br/><br/>

        Bad Parts: <input type="text" name="badParts" /><br /><br />

        Ribbon Change: <input type="text" name="ribbonChange" /><br /><br />

        Glue Test: <input type="text" name="glueTest" /><br /><br />

        Full Skid: <input type="text" name="fullSkid" /><br /><br />

        Trash: <input type="text" name="trash" /><br /><br />

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
<%@taglib prefix="cc" uri="http://charlesclark.com/tags"%>

<html>
<body>
<h2><cc:Time/></h2>
</body>
</html>

    <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
    <title>User Input Form</title>
</head>

<body>
<h2>Mach Production Form</h2>
<form method="get" action="echo">
    <fieldset>
        <legend>Personal Particular</legend>
        Name: <input type="text" name="username" /><br /><br />

        Product Name <select name = "productName">
        <option value="1">213 Air filter</option>
        <option value="2">410 Air filter</option>
        <option value="3">413 Air filter</option>
        <option value="4">501 Air filter</option>
        <option value="5">513 Air filter</option>
    </select>
    </fieldset>


    <fieldset>
        <legend>Instruction</legend>
        <textarea rows="5" cols="30" name="instruction">Enter your instruction here...</textarea>
    </fieldset>
    <br />

    <input type="submit" value="SEND" />
    <input type="reset" value="CLEAR" />
</form>
<hr />

</body>
</html>
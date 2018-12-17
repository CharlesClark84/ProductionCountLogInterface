<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>
<%@include file="navbar.jsp"%>

<html><body text-align="center">
<br/>
<div class="container-fluid">
    <div class="well center">
        <h2>Name Info</h2><br/><br/>


        <table border="1" cellpadding="5" cellspacing="5" width="40%" margin="auto" class="table table-striped table-hover">

            <tr>
                <th>First Name</th>
                <td>${first}</td>
            </tr>

            <tr>
                <th>Last Name</th>
                <td>${last}</td>
            </tr>

            <tr>
                <th>Address</th>
                <td>${Address}</td>
            </tr>

            <tr>
                <th>City</th>
                <td>${City}</td>
            </tr>

            <tr>
                <th>State</th>
                <td>${State}</td>
            </tr>

            <tr>
                <th>Zip</th>
                <td>${Zip}</td>
            </tr>

            <tr>
                <th>Password</th>
                <td>${pass}</td>
            </tr>

            <tr>
                <th>Your employee id is</th>
                <td>${user.id}</td>
            </tr>


        </table>

        <a class="btn btn-success btn-send" href="newEmployee.jsp">I'm Finished</a> <button class="btn btn-success btn-send" onclick="printFunction()">Print this page</button>
    </div>
</div>

<script>
    function printFunction() {
        window.print();
    }
</script>

</body>
</html>

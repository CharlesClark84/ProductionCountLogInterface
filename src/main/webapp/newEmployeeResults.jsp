<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>
<%@include file="navbar.jsp"%>

<html><body text-align="center">
<br/>
<div class="container-fluid">
    <div class="well">
        <h2>Name Info</h2><br/><br/>


        <table border="1" cellpadding="5" cellspacing="5" width="50%" margin="auto" class="table table-striped table-hover">

            <tr>
                <td>First Name</td>
                <td>${first}</td>
            </tr>

            <tr>
                <td>Last Name</td>
                <td>${last}</td>
            </tr>

            <tr>
                <td>Address</td>
                <td>${Address}</td>
            </tr>

            <tr>
                <td>City</td>
                <td>${City}</td>
            </tr>

            <tr>
                <td>State</td>
                <td>${State}</td>
            </tr>

            <tr>
                <td>Zip</td>
                <td>${Zip}</td>
            </tr>

            <tr>
                <td>Password</td>
                <td>${pass}</td>
            </tr>


        </table>

        <a class="btn btn-success btn-send" href="newEmployee.jsp">I'm Finished</a><button onclick="printFunction()">Print this page</button>
    </div>
</div>

<script>
    function printFunction() {
        window.print();
    }
</script>

</body>
</html>

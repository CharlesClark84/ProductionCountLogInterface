<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>
<%@include file="navbar.jsp"%>

<html>
<body class="center">
<br/>
<div class="container-fluid">
    <div class="well">
        <h2 class="center">Receipt</h2><br/><br/>


        <table border="1" cellpadding="5" cellspacing="5" width="50%" margin="auto"  class="table table-striped table-hover center">

            <tr>

                <td>${message}</td>
            </tr>

        </table>
        <br/><br/>
        <div class="center">
            <a href="admin.jsp" class="btn btn-success btn-send">I'm Finished</a>
        </div>


    </div>

</div>

</body>
</html>
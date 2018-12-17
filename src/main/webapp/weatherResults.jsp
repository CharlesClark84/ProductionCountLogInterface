<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>
<%@include file="navbar.jsp"%>

<html><body text-align="center">

<div class="container-fluid">
    <div class="well center">

        <h2>Weather Confirm</h2><br/><br/>


        <table border="1" cellpadding="5" cellspacing="5" width="60%" margin="auto" padding="10" class="table table-striped table-hover">

            <tr>
                <th>Employee Number</th>
                <td>${number}</td>
            </tr>

            <tr>
                <th>Confim Weather Checked</th>
                <td>${con}</td>
            </tr>

            <tr>
                <th>Date</th>
                <td>${Date}</td>
            </tr>


        </table>
        <br/>
        <div>
            <a href="index.jsp" class="btn btn-success btn-send">I'm Finished</a>
        </div>

    </div></div>

</body>
</html>

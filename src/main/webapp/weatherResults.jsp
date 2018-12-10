<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>
<%@include file="navbar.jsp"%>

<html><body text-align="center">

<div class="container-fluid">
    <div class="well center">

        <h2>Weather Confirm</h2><br/><br/>


        <table border="1" cellpadding="5" cellspacing="5" width="60%" margin="auto" padding="10" class="center">

            <tr>
                <td>Employee Number</td>
                <td>${number}</td>
            </tr>

            <tr>
                <td>Confim Weather Checked</td>
                <td>${con}</td>
            </tr>

            <tr>
                <td>Date</td>
                <td>${Date}</td>
            </tr>


        </table>
        <div>
            <a href="index.jsp" class="btn btn-success btn-send">I'm Finished</a>
        </div>

    </div></div>

</body>
</html>

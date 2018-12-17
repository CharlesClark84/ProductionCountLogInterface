<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>
<%@include file="navbar.jsp"%>

<html><body text-align="center">
<br/>
<div class="container-fluid">
    <div class="well">
    <h2 class="center">Receipt</h2><br/><br/>
    

    <table border="1" cellpadding="5" cellspacing="5" width="50%" margin="auto"  id="dataTable" class="table table-striped table-hover center">

        <tr>
            <th>Date</th>
            <td>${Date}</td>
        </tr>

        <tr>
            <th>Shift</th>
            <td>${Shift}</td>
        </tr>

        <tr>
            <th>Employee Id</th>
            <td>${id}</td>
        </tr>

        <tr>
            <th>Product Name</th>
            <td>${product}</td>
        </tr>

        <tr>
            <th>Machine Number</th>
            <td>${machine}</td>
        </tr>

        <tr>
            <th>Hours Worked</th>
            <td>${hours}</td>
        </tr>

        <tr>
            <th>Total Parts</th>
            <td>${parts}</td>
        </tr>

        <tr>
            <th>Downtime </th>
            <td>${down}</td>
        </tr>

        <tr>
            <th>Bad Parts</th>
            <td>${bad}</td>
        </tr>

        <tr>
            <th>Ribbon Change</th>
            <td>${ribbon}</td>
        </tr>

        <tr>
            <th>Glue Test</th>
            <td>${glue}</td>
        </tr>

        <tr>
            <th>Full Skid</th>
            <td>${full}</td>
        </tr>

        <tr>
            <th>Trash</th>
            <td>${waste}</td>
        </tr>

        <tr>
            <th>Credits</th>
            <td>${credit}</td>
        </tr>

        <tr>
            <th>Comments</th>
            <td>${comment}</td>
        </tr>

        <tr>
            <th>Percentage</th>
            <td>${percentage}</td>
        </tr>

        <tr>
            <th>Base Rate</th>
            <td>${baserate}</td>
        </tr>

        <tr>
            <th>Hours Earned</th>
            <td>${hoursE}</td>
        </tr>


        <tr>
            <th>Total Hours</th>
            <td>${totalHours}</td>
        </tr>

        <tr>
            <th>Daily $ Amount</th>
            <td>${day$}</td>
        </tr>

        <tr>
            <th>Hourly $ Amount</th>
            <td>${hourly$}</td>
        </tr>


    </table><br/>


       <div class="center"><a href="index.jsp" class="btn btn-success btn-send">I'm Finished</a> <button class="btn btn-success btn-send" onclick="printFunction()">Print this page</button></div>

    </div>


<script>
    function printFunction() {
        window.print();
    }
</script>

</div>

</body>
</html>

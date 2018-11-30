<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html><body text-align="center">
<br/>
<div class="container-fluid">
    <div class="well">
    <h2 class="center">Receipt</h2><br/><br/>
    

    <table border="1" cellpadding="5" cellspacing="5" width="50%" margin="auto"  class="table table-striped table-hover center">

        <tr>
            <td>Date</td>
            <td>${Date}</td>
        </tr>

        <tr>
            <td>Shift</td>
            <td>${Shift}</td>
        </tr>

        <tr>
            <td>Employee Id</td>
            <td>${id}</td>
        </tr>

        <tr>
            <td>Name</td>
            <td>${first} ${last}</td>
        </tr>

        <tr>
            <td>Product Name</td>
            <td>${product}</td>
        </tr>

        <tr>
            <td>Machine Number</td>
            <td>${machine}</td>
        </tr>

        <tr>
            <td>Hours Worked</td>
            <td>${hours}</td>
        </tr>

        <tr>
            <td>Total Parts</td>
            <td>${parts}</td>
        </tr>

        <tr>
            <td>Downtime </td>
            <td>${down}</td>
        </tr>

        <tr>
            <td>Bad Parts</td>
            <td>${bad}</td>
        </tr>

        <tr>
            <td>Ribbon Change</td>
            <td>${ribbon}</td>
        </tr>

        <tr>
            <td>Glue Test</td>
            <td>${glue}</td>
        </tr>

        <tr>
            <td>Full Skid</td>
            <td>${full}</td>
        </tr>

        <tr>
            <td>Trash</td>
            <td>${waste}</td>
        </tr>

        <tr>
            <td>Credits</td>
            <td>${credit}</td>
        </tr>

        <tr>
            <td>Comments</td>
            <td>${comment}</td>
        </tr>

        <tr>
            <td>Percentage</td>
            <td>${percentage}</td>
        </tr>

        <tr>
            <td>Base Rate</td>
            <td>${baserate}</td>
        </tr>

        <tr>
            <td>Hours Earned</td>
            <td>${hoursE}</td>
        </tr>


        <tr>
            <td>Total Hours</td>
            <td>${totalHours}</td>
        </tr>

        <tr>
            <td>Daily $ Amount</td>
            <td>${day$}</td>
        </tr>

        <tr>
            <td>Hourly $ Amount</td>
            <td>${hourly$}</td>
        </tr>


    </table>


        <a href="index.jsp">I'm Finished</a> <button onclick="printFunction()">Print this page</button>

</div>


<script>
    function printFunction() {
        window.print();
    }
</script>

    <script>

    $( function() {
    $( "td" ).sortable();
    $( "td" ).disableSelection();
    } );
    </script>


</div>

</body>
</html>

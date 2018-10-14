<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html><body>

<div class="container-fluid">
    <h2>Receipt</h2><br/><br/>
    

    <table border="1" cellpadding="5" cellspacing="5" width="50%">

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
            <td>Comments</td>
            <td>${comment}</td>
        </tr>

        <tr>
            <td>Percentage</td>
            <td>${percentage}</td>
        </tr>



    </table>






</div>

</body>
</html>

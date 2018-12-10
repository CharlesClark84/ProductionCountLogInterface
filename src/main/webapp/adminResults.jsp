<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>
<%@include file="navbar.jsp"%>

<html><body>

<div class="container-fluid">

    <div class="well">
        <h2>Search Results: </h2>
    <table  class="table table-striped table-hover" id="dataTable">
        <thead class="rounded-top">
        <th class="head">ID</th>
        <th class="head">Employee ID</th>
        <th class="head">Date</th>
        <th class="head">Shift</th>
        <th class="head">Product Name</th>
        <th class="head">Machine Number</th>
        <th class="head">Hours Worked</th>
        <th class="head">Total Parts</th>
        <th class="head">Credits</th>
        <th class="head">Downtime</th>
        <th class="head">Product Rate</th>
        <th class="head">Percentage</th>
        <th class="head">Base Rate</th>
        <th class="head">Hours Earned</th>
        <th class="head">Total Hours</th>
        <th class="head">Day$</th>
        <th class="head">Hourly$</th>
        <th class="head">Delete</th>


        </thead>
        <tbody>
        <c:forEach var="shift" items="${shifts}">
            <tr>
                <td class="body">${shift.id} </td>
                <td class="body">${shift.employeeId} </td>
                <td class="body">${shift.date} </td>
                <td class="body">${shift.shift} </td>
                <td class="body">${shift.productName}</td>
                <td class="body">${shift.machineNumber}</td>
                <td class="body">${shift.hoursWorked}</td>
                <td class="body">${shift.totalParts}</td>
                <td class="body">${shift.credits}</td>
                <td class="body">${shift.downtime}</td>
                <td class="body">${shift.productRate}</td>
                <td class="body">${shift.percentage}</td>
                <td class="body">${shift.baseRate}</td>
                <td class="body">${shift.hoursEarned}</td>
                <td class="body">${shift.totalHours}</td>
                <td class="body">${shift.day$}</td>
                <td class="body">${shift.hourly$}</td>
                <td><form action="Remove" method="post" id="removeForm">
                    <input type="id" name="id" value="${shift.id}" hidden/>
                    <button type="submit" name="remove"><span class="glyphicon glyphicon-trash"></span></button>
                </form></td>

                </td>
            </tr>
        </c:forEach>
        </tbody>


    </table>
        <div class="center">
          <a href="admin.jsp" class="btn btn-success btn-send">I'm Finished</a> <button onclick="printFunction()">Print this page</button>
        </div>
</div>
</div>
</body>
</html>


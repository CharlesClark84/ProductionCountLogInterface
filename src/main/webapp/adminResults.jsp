<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html><body>

<div class="container-fluid">

    <div class="well">
        <h2>Search Results: </h2>
    <table id="dataTable">
        <thead>
        <th class="head">Employee ID</th>
        <th class="head">Date</th>
        <th class="head">Shift</th>
        <th class="head">Product Name</th>
        <th class="head">Machine Number</th>
        <th class="head">Hours Worked</th>
        <th class="head">Total Parts</th>
        <th class="head">Credits</th>
        <th class="head">Downtime</th>
        <th class="head">productRate</th>
        <th class="head">percentage</th>
        <th class="head">baseRate</th>
        <th class="head">hoursEarned</th>
        <th class="head">totalHours</th>
        <th class="head">day$</th>
        <th class="head">hourly$</th>


        </thead>
        <tbody>
        <c:forEach var="shift" items="${shifts}">
            <tr>
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


                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</div>
</body>
</html>


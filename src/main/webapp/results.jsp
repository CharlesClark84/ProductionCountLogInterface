<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html><body>

<div class="container-fluid">
    <h2>Receipt</h2>
    <table>
        <thead>
        <th>Name</th>

        </thead>
        <tbody>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.firstName}  </td>
                <td>

                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>

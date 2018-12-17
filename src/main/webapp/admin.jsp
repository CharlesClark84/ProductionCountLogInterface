<%@taglib prefix="cc" uri="http://charlesclark.com/tags"%>
<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>

<html>
<head>
    <title>Admin page</title>
</head>

<%@include file="navbar.jsp"%>

    <div class="container-fluid">
    <div class="well center">

        <h2 class="center">Search Database</h2>

        <form id="searchData" action="search" class=form-inLine" method="get">
            <div class="form-group">

            <label>Return all data</label>
            <button type="submit" name="submit" value="getAll"  class="btn btn-success btn-send">Get All</button><br/><br/>

                <label for="id">Search by Employee Id</label>
             <input type="text" id="ID" name="ID">
            <button type="submit" name="submit" value="id"  class="btn btn-success btn-send">Get by ID</button><br/><br/>

                <label for="id">Search by Machine Number</label>
                <input type="text" id="machine" name="machine">
                <button type="submit" name="submit" value="machineNumber"  class="btn btn-success btn-send">Get by Machine</button><br/><br/>

                <label for="id">Search by Date</label>
                <input type="text" id="dates" name="dates">
                <script>
                    $('#dates').datepicker({
                        changeMonth: true,
                        changeYear: true,
                        maxDate: new Date(),
                        yearRange: '-100:+0'
                    });
                </script>
                <button type="submit" name="submit" value="dateId"  class="btn btn-success btn-send">Get by Date</button><br/><br/>

            </div>

        </form>
<br/>
      <div class="center">
        <a href="logout.jsp" class="btn btn-success btn-send">Log out</a>
      </div>

    </div></div>

</body>
</html>

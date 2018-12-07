<%@taglib prefix="cc" uri="http://charlesclark.com/tags"%>
<%@include file="taglib.jsp"%>
<%@include file="head.jsp"%>
<html>
<%@include file="navbar.jsp"%>



<div>


<div class="container">
    <div class="row well">

        <h2 class="center background">Mach Production Form</h2>
        <div class="center red">All machines must have weather check done before each shift</div>

<FORM action="echo" onsubmit="return validateForm()" method="post">

    <div class="form-group">
    <div class="col-md-5">


    <fieldset>
        <label>Shift Information</label><br/><br/>

        <label class="control-label">Date:</label> <input class="form-control" type="text" name="date" id="date" required /><br /><br />
        <script>
        $('#date').datepicker({
        changeMonth: true,
        changeYear: true,
        maxDate: new Date(),
        yearRange: '-100:+0'
        });
        </script>

        <label class="control-label">Shift:</label> <input class="form-control" type="text" name="shift" id="shift" required/><br /><br />

        <label class="control-label">Employee Id</label>: <input class="form-control" type="text" name="employeeId" required /><br /><br />

        <label class="control-label">Product Name</label> <select class="form-control" name= "productName">
        <option value="213">213 Air filter</option>
        <option value="410">410 Air filter</option>
        <option value="413">413 Air filter</option>
        <option value="501">501 Air filter</option>
        <option value="513">501 Air filter</option>
        </select><br/><br/>

        <label class="control-label">Machine Number:</label> <input class="form-control" type="text" name="machineNumber" required /><br /><br />

        <label class="control-label">Hours Worked:</label> <input class="form-control" type="text" name="hoursWorked" required /><br /><br />

        <label class="control-label">Total Parts:</label> <input class="form-control" type="text" name="totalParts" required /><br /><br />

    </fieldset>
    </div>

    <div class="col-md-5">
        <div class="form-group">

    <fieldset>
        <label>Credits</label><br/><br/>

        <label class="control-label">Downtime:</label> <input class="form-control" type="text" id="downtime" name="downtime" value="0" required   /><br /><br />

        <label class="control-label">Bad Parts:</label> <input class="form-control" type="text" name="badParts" value="0" required  /> x 0.002<br /><br />

        <label class="control-label">Ribbon Change:</label> <input class="form-control" type="text" name="ribbonChange" value="0" required  /> x 0.200<br /><br />

        <label class="control-label">Glue Test:</label> <input class="form-control" type="text" name="glueTest" value="0" required  /> x 0.100<br /><br />

        <label class="control-label">Full Skid:</label> <input class="form-control" type="text" name="fullSkid" value="0" required  /> x 0.150<br /><br />

        <label class="control-label">Trash:</label> <input class="form-control" type="text" name="trash" value="0" required  /> x 0.005<br /><br />

        <input type="text" name="id" id="id" hidden />

    </fieldset>

            <fieldset>
                <label>Shift Comments</label><br/><br/>
                <textarea rows="5" cols="30" name="comment" class="form-control" placeholder="Enter shift comments"></textarea><br/><br/>
            </fieldset>


            <input type="submit" class="btn btn-success btn-send" value="Submit">
        <input type="reset" class="btn btn-primary" value="Clear" />
        </div>
    </div>

    </div>

    <div class="col-md-2">
        <div class="form-group">
        <br/><br/><br/><input type="button" name="increase"  value="+" onclick="creditModify(this.form.elements['downtime'], this);" ><input type="button" name="decrease"  value="-" onclick="creditModify(this.form.elements['downtime'], this);" ><br/><br/>

        <br/><br/><input type="button" name="increase"  value="+" onclick="creditModify(this.form.elements['badParts'], this);" ><input type="button" name="decrease"  value="-" onclick="creditModify(this.form.elements['badParts'], this);" >

        <br/><br/><br/><br/><br/><input type="button" name="increase"  value="+" onclick="creditModify(this.form.elements['ribbonChange'], this);" ><input type="button" name="decrease"  value="-" onclick="creditModify(this.form.elements['ribbonChange'], this);" >

        <br/><br/><br/><br/><input type="button" name="increase" value="+" onclick="creditModify(this.form.elements['glueTest'], this);" ><input type="button" name="decrease"  value="-" onclick="creditModify(this.form.elements['glueTest'], this);" >

        <br/><br/><br/><br/><input type="button" name="increase"  value="+" onclick="creditModify(this.form.elements['fullSkid'], this);" ><input type="button" name="decrease"  value="-" onclick="creditModify(this.form.elements['fullSkid'], this);" >

        <br/><br/><br/><br/><br/><input type="button" name="increase"  value="+" onclick="creditModify(this.form.elements['trash'], this);" ><input type="button" name="decrease"  value="-" onclick="creditModify(this.form.elements['trash'], this);" >

        </div></div>


</FORM>


    </div>
</div></div>

<script>

        function creditModify(txtElement, btnElement) {

            switch(btnElement.name) {
                case 'increase':
                    if (txtElement.value == "") {
                        txtElement.value = '1';
                    } else {
                        txtElement.value++;
                    }
                    break;

                case 'decrease':
                    if (txtElement.value == "") {
                        txtElement.value = '0';
                    } else  {
                        if (txtElement.value > 0) {
                            txtElement.value--;
                        } else {
                            alert('The minimum value is zero for this field');
                        }
                    }
                    break;

                default:
            }

    }
</script>




</body>
</html>
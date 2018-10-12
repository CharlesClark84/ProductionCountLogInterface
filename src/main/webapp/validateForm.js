function validateForm() {
    //Shift form validation
    var shift = document.form.shift.value;
    if (isNaN(shift)) {
        window.alert("Shift must be a numeric value. You entered: " + shift);
        return false;
    }
    //Employee ID form validation
    var employeeId = document.form.employeeId.value;
    if (isNaN(employeeId)) {
        window.alert("Employee Id must be a numeric value. You entered: " + employeeId);
        return false;
    }

    //First name form validation
    var firstName = document.form.firstName.value;
    if (!isNaN(firstName)) {
        window.alert("First Name must not contain numbers or characters. You entered: " + firstName);
        return false;
    }

    //Last name form validation
    var lastName = document.form.lastName.value;
    if (!isNaN(lastName)) {
        window.alert("Last Name must not contain numbers or characters. You entered: "  + lastName);
        return false;
    }

    //Machine number form validation
    var machineNumber = document.form.machineNumber.value;
    if (isNaN(machineNumber)) {
        window.alert("Machine Number must be a numeric value. You entered: " + machineNumber);
        return false;
    }

    //Hours worked form validation
    var hoursWorked = document.form.hoursWorked.value;
    if (isNaN(hoursWorked)) {
        window.alert("Hours Worked must be a numeric value. You entered: " + hoursWorked);
        return false;
    }

    //Total parts form validation
    var totalParts = document.form.totalParts.value;
    if (isNaN(totalParts)) {
        window.alert("Total Parts must be a numeric value. You entered: " + totalParts);
        return false;
    }

    //Downtime form validation
    var downtime = document.form.downtime.value;
    if (isNaN(downtime)) {
        window.alert("Downtime must be a numeric value. You entered: " + downtime);
        return false;
    }

    //Bad Parts form validation
    var badParts = document.form.badParts.value;
    if (isNaN(badParts)) {
        window.alert("Bad Parts must be a numeric value. You entered: " + badParts);
        return false;
    }

    //Ribbon Change form validation
    var ribbonChange = document.form.ribbonChange.value;
    if (isNaN(ribbonChange)) {
        window.alert("Ribbon Change must be a numeric value. You entered: " + ribbonChange);
        return false;
    }

    //Glue Test form validation
    var glueTest = document.form.glueTest.value;
    if (isNaN(glueTest)) {
        window.alert("Glue Test must be a numeric value. You entered: " + glueTest);
        return false;
    }

    //Full Skid form validation
    var fullSkid = document.form.fullSkid.value;
    if (isNaN(fullSkid)) {
        window.alert("Full Skid must be a numeric value. You entered: " + fullSkid);
        return false;
    }

    //Trash form validation
    var trash = document.form.trash.value;
    if (isNaN(trash)) {
        window.alert("trash must be a numeric value. You entered: " + trash);
        return false;
    }

}
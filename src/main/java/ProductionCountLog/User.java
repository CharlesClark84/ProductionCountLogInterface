package ProductionCountLog;

import java.util.Date;

/**
 * User javaBean class that will hold all variable data to be used in form, calculations, and database.
 *
 * @author Charles Clark
 *
 */

public class User {

    public User() {
    }

    private Date date;
    private int shift;
    private int employeeId;
    private String firstName;
    private String lastName;
    private int orderNumber;
    private String productName;
    private int machineNumber;
    private double hoursWorked;
    private double totalParts;
    private double credits;
    private double downtime;
    private double productRate;
    private double percentage;
    private double baseRate;
    private double hoursEarned;
    private double totalHours;
    private double basePay = 12.75;
    private double day$;
    private double hourly$;
    private double badParts;
    private double ribbonChange;
    private double glueTest;
    private double fullSkid;
    private double trash;


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getMachineNumber() {
        return machineNumber;
    }

    public void setMachineNumber(int machineNumber) {
        this.machineNumber = machineNumber;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    public double getTotalParts() {
        return totalParts;
    }

    public void setTotalParts(double totalParts) {
        this.totalParts = totalParts;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public double getDowntime() {
        return downtime;
    }

    public void setDowntime(double downtime) {
        this.downtime = downtime;
    }

    public double getProductRate() {
        return productRate;
    }

    public void setProductRate(double productRate) {
        this.productRate = productRate;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }

    public double getHoursEarned() {
        return hoursEarned;
    }

    public void setHoursEarned(double hoursEarned) {
        this.hoursEarned = hoursEarned;
    }

    public double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    public double getDay$() {
        return day$;
    }

    public void setDay$(double day$) {
        this.day$ = day$;
    }

    public double getHourly$() {
        return hourly$;
    }

    public void setHourly$(double hourly$) {
        this.hourly$ = hourly$;
    }

    public double getBadParts() {
        return badParts;
    }

    public void setBadParts(double badParts) {
        this.badParts = badParts;
    }

    public double getRibbonChange() {
        return ribbonChange;
    }

    public void setRibbonChange(double ribbonChange) {
        this.ribbonChange = ribbonChange;
    }

    public double getGlueTest() {
        return glueTest;
    }

    public void setGlueTest(double glueTest) {
        this.glueTest = glueTest;
    }

    public double getFullSkid() {
        return fullSkid;
    }

    public void setFullSkid(double fullSkid) {
        this.fullSkid = fullSkid;
    }

    public double getTrash() {
        return trash;
    }

    public void setTrash(double trash) {
        this.trash = trash;
    }
}

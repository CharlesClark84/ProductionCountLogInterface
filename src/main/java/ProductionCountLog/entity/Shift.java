package ProductionCountLog.entity;

import java.util.Date;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * User javaBean class that will hold all variable data to be used in form, calculations, and database.
 *
 * @author Charles Clark
 */
@Entity(name = "Shift")
@Table(name ="shift")
public class Shift {

    /**
     * Instantiates a new User.
     */
    public Shift() {
    }

    /**
     * Instantiates a new User.
     *
     * @param date          the date
     * @param shift         the shift
     * @param employeeId    the employee id
     * @param productName   the product name
     * @param machineNumber the machine number
     * @param hoursWorked   the hours worked
     * @param totalParts    the total parts
     * @param credits       the credits
     * @param downtime      the downtime
     * @param productRate   the product rate
     * @param percentage    the percentage
     * @param baseRate      the base rate
     * @param hoursEarned   the hours earned
     * @param totalHours    the total hours
     * @param day$          the day
     * @param hourly$       the hourly
     * @param badParts      the bad parts
     * @param ribbonChange  the ribbon change
     * @param glueTest      the glue test
     * @param fullSkid      the full skid
     * @param trash         the trash
     */
    public Shift(int employeeId, String date, int shift, String productName, int machineNumber, double hoursWorked, double totalParts, double credits, double downtime, double productRate, double percentage, double baseRate, double hoursEarned, double totalHours, double day$, double hourly$, double badParts, double ribbonChange, double glueTest, double fullSkid, double trash) {
        this.employeeId = employeeId;
        this.date = date;
        this.shift = shift;
        this.productName = productName;
        this.machineNumber = machineNumber;
        this.hoursWorked = hoursWorked;
        this.totalParts = totalParts;
        this.credits = credits;
        this.downtime = downtime;
        this.productRate = productRate;
        this.percentage = percentage;
        this.baseRate = baseRate;
        this.hoursEarned = hoursEarned;
        this.totalHours = totalHours;
        this.day$ = day$;
        this.hourly$ = hourly$;
        this.badParts = badParts;
        this.ribbonChange = ribbonChange;
        this.glueTest = glueTest;
        this.fullSkid = fullSkid;
        this.trash = trash;
    }

    /**
     * The constant basePay.
     */
    @Transient
    public static final double basePay = 12.75;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native",strategy = "native")
    private int id;

    @Column(name = "date")
    private String date;

    @Column(name = "shift")
    private int shift;

    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "machine_number")
    private int machineNumber;

    @Column(name = "hours_worked")
    private double hoursWorked;

    @Column(name = "total_parts")
    private double totalParts;

    @Column(name = "credits")
    private double credits;

    @Column(name = "downtime")
    private double downtime;

    @Transient
    private double productRate;
    @Transient
    private double percentage;
    @Transient
    private double baseRate;
    @Transient
    private double hoursEarned;
    @Transient
    private double totalHours;
    @Transient
    private double day$;
    @Transient
    private double hourly$;
    @Transient
    private double badParts;
    @Transient
    private double ribbonChange;
    @Transient
    private double glueTest;
    @Transient
    private double fullSkid;
    @Transient
    private double trash;
    @Transient
    private String comment;


    /**
     * Gets date.
     *
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Gets shift.
     *
     * @return the shift
     */
    public int getShift() {
        return shift;
    }

    /**
     * Sets shift.
     *
     * @param shift the shift
     */
    public void setShift(int shift) {
        this.shift = shift;
    }

    /**
     * Gets employee id.
     *
     * @return the employee id
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets employee id.
     *
     * @param employeeId the employee id
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Gets product name.
     *
     * @return the product name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets product name.
     *
     * @param productName the product name
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Gets machine number.
     *
     * @return the machine number
     */
    public int getMachineNumber() {
        return machineNumber;
    }

    /**
     * Sets machine number.
     *
     * @param machineNumber the machine number
     */
    public void setMachineNumber(int machineNumber) {
        this.machineNumber = machineNumber;
    }

    /**
     * Gets hours worked.
     *
     * @return the hours worked
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * Sets hours worked.
     *
     * @param hoursWorked the hours worked
     */
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    /**
     * Gets total parts.
     *
     * @return the total parts
     */
    public double getTotalParts() {
        return totalParts;
    }

    /**
     * Sets total parts.
     *
     * @param totalParts the total parts
     */
    public void setTotalParts(double totalParts) {
        this.totalParts = totalParts;
    }

    /**
     * Gets credits.
     *
     * @return the credits
     */
    public double getCredits() {
        return credits;
    }

    /**
     * Sets credits.
     *
     * @param credits the credits
     */
    public void setCredits(double credits) {
        this.credits = credits;
    }

    /**
     * Gets downtime.
     *
     * @return the downtime
     */
    public double getDowntime() {
        return downtime;
    }

    /**
     * Sets downtime.
     *
     * @param downtime the downtime
     */
    public void setDowntime(double downtime) {
        this.downtime = downtime;
    }

    /**
     * Gets product rate.
     *
     * @return the product rate
     */
    public double getProductRate() {
        String prodname = getProductName();
        if(prodname == "213 Air filter") {
            productRate = 60;
        }
        if(prodname == "410 Air filter") {
            productRate = 55;
        }
        if(prodname == "413 Air filter") {
            productRate = 50;
        }
        if(prodname == "501 Air filter") {
            productRate = 45;
        }
        if(prodname == "513 Air filter") {
            productRate = 40;
        }

        return productRate;
    }

    /**
     * Sets product rate.
     *
     * @param productRate the product rate
     */
    public void setProductRate(double productRate) {
        this.productRate = productRate;
    }

    /**
     * Gets percentage.
     *
     * @return the percentage
     */
    public double getPercentage() {
        return percentage;
    }

    /**
     * Sets percentage.
     *
     * @param percentage the percentage
     */
    public void setPercentage(double percentage) {
        this.percentage = (getTotalParts() / getBaseRate());
    }

    /**
     * Gets base rate.
     *
     * @return the base rate
     */
    public double getBaseRate() {
        return baseRate;
    }

    /**
     * Sets base rate.
     *
     * @param baseRate the base rate
     */
    public void setBaseRate(double baseRate) {
        this.baseRate = (getHoursWorked() * getProductRate());
    }

    /**
     * Gets hours earned.
     *
     * @return the hours earned
     */
    public double getHoursEarned() {
        return hoursEarned;
    }

    /**
     * Sets hours earned.
     *
     * @param hoursEarned the hours earned
     */
    public void setHoursEarned(double hoursEarned) {
        this.hoursEarned = (getPercentage() * getHoursWorked());
    }

    /**
     * Gets total hours.
     *
     * @return the total hours
     */
    public double getTotalHours() {
        return totalHours;
    }

    /**
     * Sets total hours.
     *
     * @param totalHours the total hours
     */
    public void setTotalHours(double totalHours) {
        this.totalHours = (getHoursEarned() + getCredits());
    }

    /**
     * Gets base pay.
     *
     * @return the base pay
     */
    public double getBasePay() {
        return basePay;
    }

    /**
     * Get day double.
     *
     * @return the double
     */
    public double getDay$() {
        return day$;
    }

    /**
     * Set day.
     *
     * @param day$ the day
     */
    public void setDay$(double day$) {
        this.day$ = (getTotalHours() * getBasePay());
    }

    /**
     * Get hourly double.
     *
     * @return the double
     */
    public double getHourly$() {
        return hourly$;
    }

    /**
     * Set hourly.
     *
     * @param hourly$ the hourly
     */
    public void setHourly$(double hourly$) { this.hourly$ = (getPercentage() * getBasePay()); }

    /**
     * Gets bad parts.
     *
     * @return the bad parts
     */
    public double getBadParts() {return badParts;}

    /**
     * Sets bad parts.
     *
     * @param badParts the bad parts
     */
    public void setBadParts(double badParts) {this.badParts = badParts;}

    /**
     * Gets ribbon change.
     *
     * @return the ribbon change
     */
    public double getRibbonChange() {
        return ribbonChange;
    }

    /**
     * Sets ribbon change.
     *
     * @param ribbonChange the ribbon change
     */
    public void setRibbonChange(double ribbonChange) {this.ribbonChange = ribbonChange; }

    /**
     * Gets glue test.
     *
     * @return the glue test
     */
    public double getGlueTest() {return glueTest; }

    /**
     * Sets glue test.
     *
     * @param glueTest the glue test
     */
    public void setGlueTest(double glueTest) {this.glueTest = glueTest; }

    /**
     * Gets full skid.
     *
     * @return the full skid
     */
    public double getFullSkid() {return fullSkid; }

    /**
     * Sets full skid.
     *
     * @param fullSkid the full skid
     */
    public void setFullSkid(double fullSkid) {this.fullSkid = fullSkid; }

    /**
     * Gets trash.
     *
     * @return the trash
     */
    public double getTrash() {return trash; }

    /**
     * Sets trash.
     *
     * @param trash the trash
     */
    public void setTrash(double trash) {this.trash = trash; }

    /**
     * Gets comment.
     *
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets comment.
     *
     * @param comment the comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", shift=" + shift +
                ", employeeId=" + employeeId +
                ", productName='" + productName + '\'' +
                ", machineNumber=" + machineNumber +
                ", hoursWorked=" + hoursWorked +
                ", totalParts=" + totalParts +
                ", credits=" + credits +
                ", downtime=" + downtime +
                ", productRate=" + productRate +
                ", percentage=" + percentage +
                ", baseRate=" + baseRate +
                ", hoursEarned=" + hoursEarned +
                ", totalHours=" + totalHours +
                ", day$=" + day$ +
                ", hourly$=" + hourly$ +
                ", badParts=" + badParts +
                ", ribbonChange=" + ribbonChange +
                ", glueTest=" + glueTest +
                ", fullSkid=" + fullSkid +
                ", trash=" + trash +
                '}';
    }
}

package ProductionCountLog.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * The WeatherConfirm entity
 */
@Entity(name = "WeatherConfirm")
@Table(name = "weatherConfirm")
public class WeatherConfirm {

    /**
     * Instantiates a new Weather confirm.
     */
    public WeatherConfirm() {
    }

    /**
     * Instantiates a new Weather confirm.
     *
     * @param employeeId the employee id
     */
    public WeatherConfirm(int employeeId) {
        this.employeeId = employeeId;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "confirm")
    private String confirm;

    @Column(name = "date")
    private String date;

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
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
     * Gets confirm.
     *
     * @return the confirm
     */
    public String getConfirm() {
        return confirm;
    }

    /**
     * Sets confirm.
     *
     * @param confirm the confirm
     */
    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

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

    @Override
    public String toString() {
        return "WeatherConfirm{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", confirm='" + confirm + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
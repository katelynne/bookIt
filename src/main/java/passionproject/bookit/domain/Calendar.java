package passionproject.bookit.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
//@Table(name = "calendar")
public class Calendar{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date year;
    private Date month;
    private Date day;

    public Calendar() {
    }

    public Calendar(Date year, Date month, Date day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }
}

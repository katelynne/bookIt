package passionproject.bookit.domain;

import javax.persistence.*;

@Entity
public class VenueProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String venueName;
    private String firstName;
    private String lastName;
//    private Location location;

    @OneToOne
    private Calendar calendar;

    @OneToOne
    private Venue user;

    public VenueProfile() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
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


    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public Venue getUser() {
        return user;
    }

    public void setUser(Venue user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "VenueProfile{" +
                "id=" + id +
                ", venueName='" + venueName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", calendar=" + calendar +
                ", user=" + user +
                '}';
    }
}

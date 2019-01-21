package passionproject.bookit.domain;

import javax.persistence.*;

@Entity
//@Table(name = "artist_profile")
public class ArtistProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @Column(name = "group_name")
    private String groupName;

//    @Column(name = "artist_first_name")
    private String firstName;

//    @Column(name = "artist_last_name")
    private String lastName;

//    @Column(name = "artist_location")
//    private Location location;

    @OneToOne
//    @JoinColumn(unique = true)
//    @Column(name = "artist_calendar")
    private Calendar calendar;

    @OneToOne
//    @JoinColumn(unique = true)
    private Artist user;

    public ArtistProfile() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
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

    public Artist getUser() {
        return user;
    }

    public void setUser(Artist user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ArtistProfile{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", calendar=" + calendar +
                ", user=" + user +
                '}';
    }
}

package passionproject.bookit.domain;

import javax.persistence.*;

@Entity
@Table(name = "venue_profile")
public class VenueProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "venue_name")
    private String venueName;

    @Column(name = "venue_first_name")
    private String firstName;

    @Column(name = "venue_last_name")
    private String lastName;

    @Column(name = "venue_location")
    private String location;

    @Column(name = "venue_calendar")
    private Calendar calendar;

    @OneToOne    @JoinColumn(unique = true)
    private Venue user;

}

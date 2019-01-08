package passionproject.bookit.domain;

import javax.persistence.*;

@Entity
//@Table(name = "artist_profile")
public class ArtistProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "group_name")
    private String groupName;

//    @Column(name = "artist_first_name")
    private String firstName;

//    @Column(name = "artist_last_name")
    private String lastName;

//    @Column(name = "artist_location")
    private String location;

    @OneToOne
//    @JoinColumn(unique = true)
//    @Column(name = "artist_calendar")
    private Calendar calendar;

    @OneToOne
//    @JoinColumn(unique = true)
    private Artist user;
}

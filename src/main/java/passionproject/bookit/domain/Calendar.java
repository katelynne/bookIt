package passionproject.bookit.domain;

import javax.persistence.*;

@Entity
//@Table(name = "calendar")
public class Calendar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}

package passionproject.bookit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import passionproject.bookit.domain.Venue;

import java.util.Optional;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Long> {

    Optional<Venue> findOneByEmailIgnoreCase(String email);

    Optional<Venue> findOneByLogin(String login);

    Optional<Venue> findOneById(Long id);

}

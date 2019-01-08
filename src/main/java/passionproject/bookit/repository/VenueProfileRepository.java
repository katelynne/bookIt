package passionproject.bookit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import passionproject.bookit.domain.VenueProfile;

@Repository
public interface VenueProfileRepository extends JpaRepository<VenueProfile, Long> {
}

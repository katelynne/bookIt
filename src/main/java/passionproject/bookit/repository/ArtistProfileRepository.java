package passionproject.bookit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import passionproject.bookit.domain.ArtistProfile;

@Repository
public interface ArtistProfileRepository extends JpaRepository<ArtistProfile, Long> {
}

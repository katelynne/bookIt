package passionproject.bookit.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import passionproject.bookit.domain.Artist;

import java.util.Optional;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {

    Optional<Artist> findOneByEmailIgnoreCase(String email);

    Optional<Artist> findOneByLogin(String login);

    Optional<Artist> findOneById(Long id);
}

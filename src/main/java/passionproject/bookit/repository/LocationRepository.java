package passionproject.bookit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import passionproject.bookit.domain.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
}

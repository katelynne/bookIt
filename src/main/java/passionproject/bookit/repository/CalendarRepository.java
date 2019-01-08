package passionproject.bookit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import passionproject.bookit.domain.Calendar;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, Long> {
}

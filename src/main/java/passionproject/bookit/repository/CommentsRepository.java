package passionproject.bookit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import passionproject.bookit.domain.Comments;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> {
}

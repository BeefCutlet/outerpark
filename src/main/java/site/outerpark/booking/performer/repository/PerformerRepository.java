package site.outerpark.booking.performer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import site.outerpark.booking.performer.domain.entity.Performer;

public interface PerformerRepository extends JpaRepository<Performer, Long> {
}

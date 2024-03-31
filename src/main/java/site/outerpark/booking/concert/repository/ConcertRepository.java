package site.outerpark.booking.concert.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import site.outerpark.booking.concert.domain.entity.Concert;

public interface ConcertRepository extends JpaRepository<Concert, Long> {
}

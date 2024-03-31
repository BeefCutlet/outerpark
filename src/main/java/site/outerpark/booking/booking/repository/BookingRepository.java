package site.outerpark.booking.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import site.outerpark.booking.booking.domain.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}

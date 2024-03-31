package site.outerpark.booking.concert.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class ConcertDate {

    @Id
    @GeneratedValue
    @Column(name = "concert_date_id")
    private Long id;

    @Column
    private LocalDateTime date;

    @JoinColumn(name = "concert_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Concert concert;
}

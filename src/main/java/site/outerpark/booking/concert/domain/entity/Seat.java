package site.outerpark.booking.concert.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Seat {

    @Id
    @GeneratedValue
    @Column(name = "seat_id")
    private Long id;

    @Column
    private int seatNo;

    @Column
    @Enumerated(EnumType.STRING)
    private SeatStatus isBooked;

    @JoinColumn(name = "concert_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Concert concert;

    public enum SeatStatus {
        BOOKED("예약완료"),
        VACANT("공석");

        private String status;

        SeatStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }
    }
}

package site.outerpark.booking.booking.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import site.outerpark.booking.member.domain.entity.Member;
import site.outerpark.booking.concert.domain.entity.Seat;

import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Booking {

    @Id
    @GeneratedValue
    @Column(name = "booking_id")
    private Long id;

    @Column
    private LocalDateTime createdTime;

    @JoinColumn(name = "member_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @JoinColumn(name = "seat_id")
    @OneToOne(fetch = FetchType.LAZY)
    private Seat seat;

}

package site.outerpark.booking.concert.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import site.outerpark.booking.common.entity.BaseTimeEntity;
import site.outerpark.booking.performer.domain.entity.Performer;

import java.util.List;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Concert extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "concert_id")
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private Integer price;

    @Column
    private String location;

    @JoinColumn(name = "performer_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Performer performer;

    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Seat> seats;

    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
    private List<ConcertDate> concertDates;

    public void modifyConcert() {

    }
}

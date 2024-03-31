package site.outerpark.booking.performer.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import site.outerpark.booking.member.domain.entity.Member;
import site.outerpark.booking.common.entity.BaseTimeEntity;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Performer extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "performer_id")
    private Long id;

    @Column
    private String nickname;

    @JoinColumn(name = "member_id")
    @OneToOne(fetch = FetchType.LAZY)
    private Member member;
}

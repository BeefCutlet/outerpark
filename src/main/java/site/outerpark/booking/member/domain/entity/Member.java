package site.outerpark.booking.member.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import site.outerpark.booking.common.entity.BaseTimeEntity;
import site.outerpark.booking.member.domain.MemberRole;
import site.outerpark.booking.member.domain.MemberStatus;
import site.outerpark.booking.member.dto.request.MemberSaveRequest;
import site.outerpark.booking.member.dto.request.MemberUpdateRequest;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column
    private String uid;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    @Enumerated(EnumType.STRING)
    private MemberRole role;

    @Column
    @Enumerated(EnumType.STRING)
    private MemberStatus status;

    //회원 정보 저장용
    public static Member from(MemberSaveRequest memberSaveRequest) {
        return Member.builder()
                .uid(memberSaveRequest.getUid())
                .password(memberSaveRequest.getPassword())
                .name(memberSaveRequest.getName())
                .role(MemberRole.USER)
                .status(MemberStatus.ACTIVE)
                .build();
    }

    //회원 정보 수정용
    public void modifyPassword(String rawPassword, PasswordEncoder passwordEncoder) {
        this.password = passwordEncoder.encode(rawPassword);
    }

    //패스워드 일치 여부 확인
    public boolean isPasswordMatched(String requestPassword, PasswordEncoder passwordEncoder) {
        return passwordEncoder.matches(requestPassword, this.password);
    }

    //회원 정보 변경용
    public void modifyMemberStatus(MemberStatus status) {
        this.status = status;
    }

}

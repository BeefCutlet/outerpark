package site.outerpark.booking.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import site.outerpark.booking.member.domain.entity.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findMemberByUid(String uid);
}

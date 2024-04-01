package site.outerpark.booking.member.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import site.outerpark.booking.common.exception.MemberAlreadyExist;
import site.outerpark.booking.member.domain.MemberStatus;
import site.outerpark.booking.member.domain.entity.Member;
import site.outerpark.booking.member.dto.request.MemberSaveRequest;
import site.outerpark.booking.member.dto.request.MemberUpdateRequest;
import site.outerpark.booking.member.repository.MemberRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    /**
     * 회원 정보 저장 (회원가입)
     */
    public void saveMember(final MemberSaveRequest memberSaveRequest) {
        //회원 정보가 이미 존재하는지 확인하기 위해 회원 정보 조회
        final Optional<Member> findMember = memberRepository.findMemberByUid(memberSaveRequest.getUid());
        if (findMember.isPresent()) {
            throw new MemberAlreadyExist();
        }

        //회원 정보 저장
        final Member member = Member.from(memberSaveRequest);
        memberRepository.save(member);
    }

    /**
     * 회원 정보 수정 (마이페이지)
     */
    public void modifyMember(final String uid, final MemberUpdateRequest memberUpdateRequest) {
        //회원 정보 조회 - 없으면 예외 발생
        final Member findMember = memberRepository.findMemberByUid(uid).orElseThrow(() -> {
            throw new IllegalArgumentException("회원 정보가 존재하지 않습니다.");
        });

        //회원 정보 수정
        findMember.modifyPassword(memberUpdateRequest.getPassword(), passwordEncoder);
    }

    /**
     * 회원 탈퇴
     */
    public void withdrawMember(final String uid) {
        //회원 정보 조회 - 없으면 예외 발생
        final Member findMember = memberRepository.findMemberByUid(uid).orElseThrow(() -> {
            throw new IllegalArgumentException("회원 정보가 존재하지 않습니다.");
        });

        //회원 정보 수정
        findMember.modifyMemberStatus(MemberStatus.WITHDRAWAL);
    }
}

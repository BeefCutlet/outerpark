package site.outerpark.booking.auth.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import site.outerpark.booking.auth.dto.LoginMember;
import site.outerpark.booking.member.domain.entity.Member;
import site.outerpark.booking.member.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class CustomUserService implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Member member = memberRepository.findMemberByUid(username).orElseThrow(() -> {
            throw new IllegalArgumentException("회원 정보를 찾을 수 없습니다.");
        });
        return new LoginMember(member);
    }
}

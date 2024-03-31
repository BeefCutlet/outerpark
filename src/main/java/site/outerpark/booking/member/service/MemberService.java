package site.outerpark.booking.member.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import site.outerpark.booking.member.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
}

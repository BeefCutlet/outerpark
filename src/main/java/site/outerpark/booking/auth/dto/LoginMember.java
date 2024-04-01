package site.outerpark.booking.auth.dto;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import site.outerpark.booking.member.domain.entity.Member;

import java.util.Collections;

public class LoginMember extends User {

    public LoginMember(Member member) {
        super(member.getUid(), member.getPassword(),
                Collections.singleton(new SimpleGrantedAuthority(member.getRole().getRole())));
    }
}

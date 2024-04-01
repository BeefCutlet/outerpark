package site.outerpark.booking.auth.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import site.outerpark.booking.auth.dto.LoginMember;

@RequiredArgsConstructor
public class CustomAuthenticationProvider implements AuthenticationProvider {

    private final CustomUserService userService;
    private final PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        //인증 요청 정보
        String uid = (String) authentication.getPrincipal();
        String password = (String) authentication.getCredentials();

        //저장된 사용자 정보
        LoginMember loginMember = (LoginMember) userService.loadUserByUsername(uid);

        //비밀번호가 일치하지 않으면, 예외처리
        if (!passwordEncoder.matches(password, loginMember.getPassword())) {
            throw new BadCredentialsException("비밀번호가 일치하지 않습니다.");
        }

        return new UsernamePasswordAuthenticationToken(loginMember.getUsername(), loginMember.getPassword());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.isAssignableFrom(UsernamePasswordAuthenticationToken.class);
    }
}

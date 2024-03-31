package site.outerpark.booking.member.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.outerpark.booking.member.dto.response.MemberResponse;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberApiController {

    /**
     * 사용자 정보 조회 (마이페이지)
     */
    @GetMapping("/info")
    public MemberResponse findMember(HttpSession session) {

        return new MemberResponse();
    }
}

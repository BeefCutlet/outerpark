package site.outerpark.booking.member.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.outerpark.booking.member.dto.request.MemberUpdateRequest;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    /**
     * 사용자 정보 수정 (마이페이지)
     */
    @PutMapping
    public void modifyMember(MemberUpdateRequest memberUpdateRequest, HttpSession session) {

    }
}

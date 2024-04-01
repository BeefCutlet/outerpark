package site.outerpark.booking.member.controller;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import site.outerpark.booking.auth.dto.LoginMember;
import site.outerpark.booking.member.dto.request.MemberSaveRequest;
import site.outerpark.booking.member.dto.request.MemberUpdateRequest;
import site.outerpark.booking.member.service.MemberService;

@Slf4j
@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    /**
     * 회원 정보 저장 (회원가입)
     */
    @PostMapping
    public void saveMember(@RequestBody @Valid final MemberSaveRequest memberSaveRequest) {
        memberService.saveMember(memberSaveRequest);
    }

    /**
     * 사용자 정보 수정 (마이페이지)
     */
    @PutMapping
    public void modifyMember(@RequestBody @Valid final MemberUpdateRequest memberUpdateRequest,
                             @AuthenticationPrincipal LoginMember loginMember) {
        memberService.modifyMember(loginMember.getUsername(), memberUpdateRequest);
    }

    /**
     * 회원 탈퇴 - 회원 상태 변경
     */
    @PutMapping("/withdrawal")
    public void withdrawMember(@AuthenticationPrincipal LoginMember loginMember) {
        memberService.withdrawMember(loginMember.getUsername());
    }
}

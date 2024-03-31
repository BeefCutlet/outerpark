package site.outerpark.booking.performer.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.outerpark.booking.performer.dto.request.PerformerSaveRequest;
import site.outerpark.booking.performer.dto.request.PerformerUpdateRequest;

@RestController
@RequestMapping("/performers")
@RequiredArgsConstructor
public class PerformerController {

    /**
     * 공연자 정보 저장 (공연자 가입 - 공연자 권한 획득)
     */
    @PostMapping
    public void savePerformer(PerformerSaveRequest performerSaveRequest) {

    }

    /**
     * 공연자 정보 수정 (공연자 페이지)
     */
    @PutMapping
    public void modifyPerformer(PerformerUpdateRequest performerUpdateRequest, HttpSession session) {

    }
}

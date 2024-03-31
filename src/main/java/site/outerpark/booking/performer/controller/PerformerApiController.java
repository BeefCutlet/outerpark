package site.outerpark.booking.performer.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.outerpark.booking.performer.dto.response.PerformerResponse;

@RestController
@RequestMapping("/performers")
@RequiredArgsConstructor
public class PerformerApiController {

    /**
     * 공연자 정보 단건 조회
     */
    @GetMapping("/info")
    public PerformerResponse findPerformer(HttpSession session) {

        return new PerformerResponse();
    }
}

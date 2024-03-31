package site.outerpark.booking.concert.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.outerpark.booking.concert.dto.request.ConcertSaveRequest;
import site.outerpark.booking.concert.dto.request.ConcertUpdateRequest;

@RestController
@RequestMapping("/concerts")
@RequiredArgsConstructor
public class ConcertController {

    /**
     * 콘서트 정보 등록 (공연자만 가능)
     */
    @PostMapping
    public void saveConcert(ConcertSaveRequest concertSaveRequest, HttpSession session) {

    }

    /**
     * 콘서트 정보 수정 (공연자만 가능)
     */
    @PutMapping
    public void modifyConcert(ConcertUpdateRequest concertUpdateRequest, HttpSession session) {

    }
}

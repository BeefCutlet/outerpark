package site.outerpark.booking.concert.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.outerpark.booking.concert.dto.response.BookedConcertResponse;
import site.outerpark.booking.concert.dto.response.ConcertResponse;
import site.outerpark.booking.concert.service.ConcertService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/concerts")
@RequiredArgsConstructor
public class ConcertApiController {

    private final ConcertService concertService;

    /**
     * 콘서트 정보 단건 조회
     */
    @GetMapping("/{concertId}")
    public ConcertResponse findConcert(@PathVariable Long concertId) {

        return new ConcertResponse();
    }

    /**
     * 사용자가 예매한 콘서트 목록 조회
     */
    @GetMapping("/list")
    public List<BookedConcertResponse> findBookedConcerts(HttpSession session) {

        return new ArrayList<>();
    }
}

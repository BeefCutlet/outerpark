package site.outerpark.booking.booking.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.outerpark.booking.booking.dto.response.BookingResponse;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bookings")
@RequiredArgsConstructor
public class BookingApiController {

    /**
     * 사용자가 예매한 콘서트 정보 단건 조회
     */
    @GetMapping("/{bookingId}")
    public BookingResponse findBooking(@PathVariable String bookingId) {

        return new BookingResponse();
    }

    /**
     * 사용자가 예매한 콘서트 목록 조회
     */
    @GetMapping
    public List<?> findBookings(HttpSession session) {

        return new ArrayList<>();
    }
}

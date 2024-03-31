package site.outerpark.booking.booking.controller;

import org.springframework.web.bind.annotation.*;
import site.outerpark.booking.booking.dto.request.BookingSaveRequest;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @PostMapping
    public void saveBooking(@RequestBody BookingSaveRequest bookingSaveRequest) {

    }

    @DeleteMapping("/{bookingId}")
    public void deleteBooking(@PathVariable String bookingId) {

    }
}

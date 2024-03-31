package site.outerpark.booking.concert.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import site.outerpark.booking.concert.repository.ConcertRepository;

@Service
@RequiredArgsConstructor
public class ConcertService {

    private final ConcertRepository concertRepository;
}

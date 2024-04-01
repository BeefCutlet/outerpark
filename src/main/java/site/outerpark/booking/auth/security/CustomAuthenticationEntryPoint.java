package site.outerpark.booking.auth.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import site.outerpark.booking.common.exception.dto.ErrorCode;
import site.outerpark.booking.common.exception.dto.ErrorResponse;

import java.io.IOException;

@RequiredArgsConstructor
public class CustomAuthenticationEntryPoint implements AuthenticationEntryPoint {

    private final ObjectMapper objectMapper;

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException)
            throws IOException, ServletException {
        //에러 응답용 객체 생성
        ErrorResponse errorResponse = ErrorResponse.from(ErrorCode.ACCESS_DENIED);
        //응답용 스트림 생성
        ServletOutputStream outputStream = response.getOutputStream();

        //응답 헤더 설정
        response.setStatus(ErrorCode.ACCESS_DENIED.getStatus().value());
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        //응답
        outputStream.write(objectMapper.writeValueAsBytes(errorResponse));
    }
}

package site.outerpark.booking.common.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import site.outerpark.booking.common.exception.dto.ErrorCode;
import site.outerpark.booking.common.exception.dto.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 입력값 검증 예외
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse requestArgsNotValid() {
        return ErrorResponse.from(ErrorCode.REQUEST_ARGS_NOT_VALID);
    }
}

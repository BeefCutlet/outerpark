package site.outerpark.booking.common.exception.handler.member;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import site.outerpark.booking.common.exception.MemberAlreadyExist;
import site.outerpark.booking.common.exception.dto.ErrorCode;
import site.outerpark.booking.common.exception.dto.ErrorResponse;

@RestControllerAdvice(basePackages = "site/outerpark/booking/member/controller")
public class MemberExceptionHandler {

    @ExceptionHandler(MemberAlreadyExist.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse memberAlreadyExist() {
        return ErrorResponse.from(ErrorCode.MEMBER_ALREADY_EXIST);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse memberNotFound(IllegalArgumentException e) {
        return ErrorResponse.of(ErrorCode.DATA_NOT_FOUND, e.getMessage());
    }
}

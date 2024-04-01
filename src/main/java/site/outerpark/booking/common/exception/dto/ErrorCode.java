package site.outerpark.booking.common.exception.dto;

import org.springframework.http.HttpStatus;

public enum ErrorCode {
    REQUEST_ARGS_NOT_VALID(HttpStatus.BAD_REQUEST, "입력한 데이터의 형식이 올바르지 않습니다."),
    MEMBER_ALREADY_EXIST(HttpStatus.BAD_REQUEST, "이미 회원이 존재합니다."),
    DATA_NOT_FOUND(HttpStatus.NOT_FOUND, "데이터가 존재하지 않습니다."),
    ACCESS_DENIED(HttpStatus.FORBIDDEN, "접근이 거부되었습니다."),
    ;

    private final HttpStatus status;
    private final String message;

    ErrorCode(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}

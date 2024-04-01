package site.outerpark.booking.auth.dto;

import lombok.Getter;

@Getter
public class LoginRequest {

    private String uid;
    private String password;
}

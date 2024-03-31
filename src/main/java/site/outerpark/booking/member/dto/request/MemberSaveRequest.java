package site.outerpark.booking.member.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class MemberSaveRequest {

    @NotBlank
    private String uid;
    @NotBlank
    private String password;
    @NotBlank
    private String name;
}

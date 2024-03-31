package site.outerpark.booking.common.exception;

public class MemberAlreadyExist extends RuntimeException {

    public MemberAlreadyExist() {
    }

    public MemberAlreadyExist(String message) {
        super(message);
    }
}

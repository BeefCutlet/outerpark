package site.outerpark.booking.member.domain;

public enum MemberRole {
    USER("ROLE_USER"),
    PERFORMER("ROLE_PERFORMER"),
    ADMIN("ADMIN");

    private String role;

    MemberRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}

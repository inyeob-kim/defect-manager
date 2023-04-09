package domain.member.business;

public enum MemberPositionEnum {

    DEVELOPER("1"), //
    BUSINESS_MANAGER("2"), //
    PROJECT_LEADER("3"), // PL
    PROJECT_MANAGER("4"); // PM

    private String position;

    MemberPositionEnum(String status) {
        this.position = position;
    }

    public String getValue() {
        return this.position;
    }

}

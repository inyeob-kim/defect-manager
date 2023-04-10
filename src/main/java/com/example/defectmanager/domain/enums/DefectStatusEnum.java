package com.example.defectmanager.domain.enums;

/**
 * 결함 상태 Enum
 */
public enum DefectStatusEnum {

    REGISTERED("1"), // 등록
    ASSIGNED("2"), // 할당
    ESCALATED("3"), // 이관
    DENY_REQUEST("4"),
    REJECT("5"), // 거부
    IN_PROGRESS("6"), // 조치중
    COMPLETED("7"), // 조치완료
    PL_VERIFIED("8"), // PL확인완료
    TERMINATED("9"), // 종료
    REASSIGNED("10"); // 재할당

    private String status;

    DefectStatusEnum(String status) {
        this.status = status;
    }

    public String getValue() {
        return this.status;
    }

}

package com.example.defectmanager.domain.enums;


/**
 * 결함 심각도 Enum
 */
public enum DefectSeverityEnum {

    FATAL("1"), // 치명결함
    MAJOR("2"), // 중결함
    LIGHT("3"), // 경결함
    SIMPLE("4"); // 단순결함

    private String severity;

    DefectSeverityEnum(String severity) {
        this.severity = severity;
    }

    public String getValue() {
        return this.severity;
    }
}

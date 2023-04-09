package domain.defect.business.enums;

/**
 * 결함 우선순위 Enum
 */
public enum DefectPriorityEnum {

    HIGH("1"),
    MEDIUM("2"),
    LOW("3");

    private String priority;

    DefectPriorityEnum(String status) {
        this.priority = priority;
    }

    public String getValue() {
        return this.priority;
    }
}

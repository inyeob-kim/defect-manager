package domain.defect.business.enums;

import domain.defect.model.DataDefect;

public enum DefectTypeEnum {

    // TODO
    DATA("1", "DataDefect.class"),
    LOGICAL("2", "LogicalDefect.class");

    private String type;
    private String defectClass;

    DefectTypeEnum(String type, String defectClass) {
        this.type = type;
        this.defectClass = defectClass;
    }

    public String getValue() {
        return this.type;
    }

    public String getDefectClass() {
        return this.defectClass;
    }
}

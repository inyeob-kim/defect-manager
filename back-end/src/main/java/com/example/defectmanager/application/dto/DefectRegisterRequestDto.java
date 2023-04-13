package com.example.defectmanager.application.dto;

import com.example.defectmanager.domain.entity.Defect;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class DefectRegisterRequestDto {
    private String title;
    private String content;
    private String type;
    private String status;
    private String priority;
    private String severity;
    private Long defectRegistrantId;
    private Long defectHandlerId;

    @Builder
    public DefectRegisterRequestDto(String title, String content, String type, String status, String priority, String severity, Long defectRegistrantId, Long defectHandlerId) {
        this.title = title;
        this.content = content;
        this.type = type;
        this.status = status;
        this.priority = priority;
        this.severity = severity;
        this.defectRegistrantId = defectRegistrantId;
        this.defectHandlerId = defectHandlerId;
    }

    public Defect toEntity() {
        return Defect.builder()
                .title(title)
                .content(content)
                .type(type)
                .status(status)
                .priority(priority)
                .severity(severity)
                .defectRegistrantId(defectRegistrantId)
                .defectHandlerId(defectHandlerId)
                .build();
    }
}

package com.example.defectmanager.application.dto;

import com.example.defectmanager.domain.entity.Defect;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DefectRegisterRequestDto {
    private String title;
    private String content;
    private String type;
    private String status;
    private String priority;
    private String severity;
    private Long defectRegistrantId;
    private Long defectHandlerId;
}

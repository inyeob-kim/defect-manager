package com.example.defectmanager.presentation;

import com.example.defectmanager.application.dto.DefectRegisterRequestDto;
import com.example.defectmanager.application.DefectRegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class DefectController {

    private final DefectRegisterService defectRegisterService;

    @PostMapping("/api/v1/defect")
    public Long save(@RequestBody DefectRegisterRequestDto requestDto) {
        return this.defectRegisterService.save(requestDto);
    }

}

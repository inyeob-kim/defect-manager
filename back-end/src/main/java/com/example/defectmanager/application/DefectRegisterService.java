package com.example.defectmanager.application;

import com.example.defectmanager.application.dto.DefectRegisterRequestDto;
import com.example.defectmanager.domain.repository.DefectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class DefectRegisterService {

    private final DefectRepository defectRepository;


    @Transactional
    public Long save(DefectRegisterRequestDto requestDto) {
        return this.defectRepository.save(requestDto.toEntity()).getId();
    }
}

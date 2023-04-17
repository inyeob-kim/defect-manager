package com.example.defectmanager.presentation;

import com.example.defectmanager.application.DefectInquiryService;
import com.example.defectmanager.application.dto.DefectRegisterRequestDto;
import com.example.defectmanager.application.DefectRegisterService;
import com.example.defectmanager.domain.entity.Defect;
import com.example.defectmanager.domain.entity.Member;
import com.example.defectmanager.domain.errors.DefectNotFoundException;
import com.example.defectmanager.domain.errors.MemberNotFoundException;
import com.example.defectmanager.domain.repository.DefectRepository;
import com.example.defectmanager.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.Charset;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class DefectController {

    private final DefectRegisterService defectRegisterService;
    private final DefectInquiryService defectInquiryService;
    private final MemberRepository memberRepository;


    @PostMapping("/v1/defects")
    public Long save(@RequestBody DefectRegisterRequestDto requestDto) {
        return this.defectRegisterService.save(requestDto);
    }


    @GetMapping("/defects/{id}")
    public ResponseEntity<Defect> getDefectById(@PathVariable("id") Long id) {

        Defect defect = null;

        try {
            defect = this.defectInquiryService.getDefectById(id);
        } catch (DefectNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(defect, HttpStatus.OK);
    }

    @GetMapping("defects/{memberId}")
    public ResponseEntity<List<Defect>> getAllDefectsByDefectHandler(@PathVariable("id") Long defectHandlerId) {

        List<Defect> defectList = null;

        try {
            defectList = this.defectInquiryService.getAllDefectsByDefectHandler(defectHandlerId);
        } catch (MemberNotFoundException me) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(defectList, HttpStatus.OK);
    }

    private ResponseEntity<Defect> _getResponseEntity(Defect defect) {

//        HttpHeaders httpHeader = new HttpHeaders();
//        httpHeader.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
        return new ResponseEntity<>(defect, new HttpHeaders(), HttpStatus.OK);
    }

}

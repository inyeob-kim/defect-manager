package service;

import domain.defect.business.dto.DefectCreationIn;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegisterDefectService {


    @Transactional
    public Long registerDefect(DefectCreationIn defectCreationIn) {
        // TODO
        return null;
    }
}

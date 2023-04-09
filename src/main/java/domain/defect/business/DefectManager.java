package domain.defect.business;

import domain.defect.model.Defect;
import domain.defect.business.dto.DefectCreationIn;
import domain.defect.business.dto.DefectQueryIn;
import domain.member.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repository.DefectRepositoy;

import java.util.List;


/**
 *
 * Defect Manager
 *
 * 결함 인스턴스 생성, 관리 및 객체 조회용 빈
 */
@Component
public class DefectManager {

    @Autowired
    private DefectRepositoy defectRepositoy;

    @Autowired
    private DefectValidator defectCreationValidator;

    public Defect createDefect(DefectCreationIn defectCreationIn) {

        /**
         * 결함 생성 검증
         */
        DefectValidator.verifyCreation(defectCreationIn);

        /**
         * TODO 결함 생성 파라미터 정할 필요 있음...
         */
        Member registrant = defectCreationIn.getRegistrant();
        Member handler = defectCreationIn.getHandler();
        String title = defectCreationIn.getTitle();
        String description = defectCreationIn.getDescription();

        Defect defect = null;

        return defect;
    }

    public Defect getDefect(String id) {
        return defectRepositoy.selectById(id);
    }

    public List<Defect> getListDefect(DefectQueryIn defectQueryIn) {
        return defectRepositoy.selectList(defectQueryIn);
    }
}

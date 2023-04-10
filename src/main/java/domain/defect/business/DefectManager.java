package domain.defect.business;

import domain.defect.business.enums.DefectTypeEnum;
import domain.defect.model.Defect;
import domain.defect.business.dto.DefectCreationIn;
import domain.defect.business.dto.DefectQueryIn;
import domain.member.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repository.DefectRepositoy;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * Defect Manager
 *
 * 결함 인스턴스 생성, 관리 및 객체 조회용 빈
 */
@Component
public class DefectManager {

    private Map<String, Class<?>> cacheMap = new HashMap<>();

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
         * 결함 인스턴스 생성
         */
        // TODO

        Class clazz = Class.forName(DefectTypeEnum.get);
        Defect defect = (Defect) clazz.getConstructor().newInstance();

        /**
         * TODO
         */
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

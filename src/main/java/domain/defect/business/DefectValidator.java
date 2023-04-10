package domain.defect.business;

import domain.defect.business.dto.DefectCreationIn;
import domain.defect.business.exceptions.InvalidDefectCreationException;
import org.thymeleaf.util.StringUtils;

/**
 * 결함 인스턴스 생성 검증 클래스
 */
public class DefectValidator {

    public static void verifyCreation(DefectCreationIn defectCreationIn) {

        /**
         * 필수 입력 검증
         */
        _verifyRequiredInput(defectCreationIn);

        /**
         * 결함 유형 검증
         */
        _verifyDefectType(defectCreationIn);

        /**
         * 결함 상태 검증
         */
        _verifyDefectStatus(defectCreationIn);

        /**
         * ...TODO ?
         */

    }



    private static void _verifyRequiredInput(DefectCreationIn defectCreationIn) {

        if (defectCreationIn.getRegistrant() == null) {
            throw new InvalidDefectCreationException("결함 등록자 필수 입력");
        } else if (defectCreationIn.getHandler() == null) {
            throw new InvalidDefectCreationException("결함 조치자 필수 입력");
        } else if (StringUtils.isEmpty(defectCreationIn.getTitle())) {
            throw new InvalidDefectCreationException("결함 제목 필수 입력");
        } else if (StringUtils.isEmpty(defectCreationIn.getDescription())) {
            throw new InvalidDefectCreationException("결함 내용 필수 입력");
        }
    }


    private static void _verifyDefectType(DefectCreationIn defectCreationIn) {
    }


    private static void _verifyDefectStatus(DefectCreationIn defectCreationIn) {
    }


}

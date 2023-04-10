package service.defect;

import domain.defect.business.DefectManager;
import domain.defect.business.dto.DefectCreationIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.defect.dto.DefectCreationSrvcIn;

import java.lang.reflect.InvocationTargetException;

@Service
public class RegisterDefectService {

    @Autowired
    private DefectManager defectManager;


    @Transactional
    public Long registerDefect(DefectCreationSrvcIn defectCreationSrvcIn) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        /**
         * TODO 멤버 조회
         */

        /**
         * dto convert
         */
        DefectCreationIn crtnIn = _convertDefectCreationSrvcIn(defectCreationSrvcIn);


        /**
         *
         */
        defectManager.createDefect(crtnIn);
        // TODO
        return null;
    }

    private DefectCreationIn _convertDefectCreationSrvcIn(DefectCreationSrvcIn srvcIn) {

        DefectCreationIn crtnIn = new DefectCreationIn();

        crtnIn.setDescription(srvcIn.getDescription());
        crtnIn.setStatus(srvcIn.getStatus());
        crtnIn.setType(srvcIn.getType());
        crtnIn.setPriority(srvcIn.getPriority());
        crtnIn.setHandler(srvcIn.getHandler());
        crtnIn.setSeverity(srvcIn.getSeverity());
        crtnIn.setRegistrant(srvcIn.getRegistrant());

        return crtnIn;
    }
}

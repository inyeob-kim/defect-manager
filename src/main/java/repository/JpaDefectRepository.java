package repository;

import domain.defect.model.Defect;
import domain.defect.business.dto.DefectQueryIn;
import domain.repository.DefectRepositoy;

import java.util.List;

public class JpaDefectRepository implements DefectRepositoy {
    @Override
    public Defect selectById(String id) {
        return null;
    }

    @Override
    public List<Defect> selectList(DefectQueryIn defectQueryIn) {
        return null;
    }
}

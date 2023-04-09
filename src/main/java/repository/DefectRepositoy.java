package repository;

import domain.defect.model.Defect;
import domain.defect.business.dto.DefectQueryIn;

import java.util.List;

public interface DefectRepositoy {
    public Defect selectById(String id);

    public List<Defect> selectList(DefectQueryIn defectQueryIn);
}

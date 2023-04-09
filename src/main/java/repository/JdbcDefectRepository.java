package repository;

import domain.defect.model.Defect;
import domain.defect.business.dto.DefectQueryIn;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcDefectRepository implements DefectRepositoy{
    @Override
    public Defect selectById(String id) {
        return null;
    }

    @Override
    public List<Defect> selectList(DefectQueryIn defectQueryIn) {
        return null;
    }
}

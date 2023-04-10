package repository.defect;

import domain.defect.model.Defect;
import domain.defect.business.dto.DefectQueryIn;
import domain.repository.DefectRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcDefectRepository implements DefectRepository {
    @Override
    public Defect selectById(String id) {
        return null;
    }

    @Override
    public List<Defect> selectList(DefectQueryIn defectQueryIn) {
        return null;
    }
}

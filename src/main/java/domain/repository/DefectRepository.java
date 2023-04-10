package domain.repository;

import domain.defect.model.Defect;
import domain.defect.business.dto.DefectQueryIn;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository 인터페이스가 도메인 패키지 안에 위치하는 이유는 DIP 개념 적용
 *
 * 실제 구현체는 repository 패키지 안에 있음.
 */
@Repository
public interface DefectRepository {
    public Defect find(Long id);

    public Long save(Defect defect);


}

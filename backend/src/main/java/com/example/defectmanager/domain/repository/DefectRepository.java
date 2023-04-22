package com.example.defectmanager.domain.repository;

import com.example.defectmanager.domain.entity.Defect;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 인터페이스를 생성 후, JpaRepository<Entity, PK Type>를 상속하면 기본 CRUD는 생성됨.
 */
public interface DefectRepository extends JpaRepository<Defect, Long> {
    
}

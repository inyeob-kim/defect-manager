package com.example.defectmanager.domain.repository;

import com.example.defectmanager.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    public Member findByEmail(String email);
}

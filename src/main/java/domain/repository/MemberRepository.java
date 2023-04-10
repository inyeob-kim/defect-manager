package domain.repository;

import domain.member.model.Member;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository {

    public Long save(Member member);

    public Member find(Long id);

}

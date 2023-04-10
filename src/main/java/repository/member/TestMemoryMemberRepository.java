package repository.member;

import domain.member.model.Member;
import domain.repository.MemberRepository;

import java.util.HashMap;
import java.util.Map;

public class TestMemoryMemberRepository implements MemberRepository {

    private static Long id = 0L;
    private static Map<Long, Member> memoryDB = new HashMap<>();


    @Override
    public Long save(Member member) {
        memoryDB.put(++id, member);
        return id;
    }

    @Override
    public Member find(Long id) {
        return memoryDB.get(id);
    }

    public static void printMemoryDB() {
        for (Map.Entry<Long, Member> entry : memoryDB.entrySet()) {
            System.out.print("id = " + entry.getKey() + "/ member = " + entry.getValue());
        }
    }
}

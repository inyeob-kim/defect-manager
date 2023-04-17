package com.example.defectmanager.application;

import com.example.defectmanager.domain.entity.Member;
import com.example.defectmanager.domain.errors.MemberNotFoundException;
import com.example.defectmanager.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberInquiryService {

    private final MemberRepository memberRepository;

    public Member getMemberById(Long id) throws MemberNotFoundException {

        Optional<Member> optionalMember = this.memberRepository.findById(id);

        if (optionalMember.isPresent()) {
            return optionalMember.get();
        }

        throw new MemberNotFoundException("Member not found by id of " + id);
    }
}

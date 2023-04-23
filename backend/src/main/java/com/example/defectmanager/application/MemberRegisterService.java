package com.example.defectmanager.application;

import com.example.defectmanager.application.dto.MemberRegisterRequestDto;
import com.example.defectmanager.domain.entity.Member;
import com.example.defectmanager.domain.errors.MemberAlreadyExistException;
import com.example.defectmanager.domain.repository.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class MemberRegisterService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public void registerMember(MemberRegisterRequestDto registerIn) throws MemberAlreadyExistException {

        /**
         * 이메일로 회원 검증
         */
        if (_checkIfMemberExist(registerIn.getEmail())) {
            throw new MemberAlreadyExistException("User already exist for this email...");
        }

        Member newMember = Member.builder()
                .firstName(registerIn.getFirstName())
                .lastName(registerIn.getLastName())
                .phoneNumber(registerIn.getPhoneNumber())
                .email(registerIn.getEmail())
                .password(passwordEncoder.encode(registerIn.getPassword()))
                .role(registerIn.getRole())
                .build();

        memberRepository.save(newMember);
    }

    private boolean _checkIfMemberExist(String email) {
        return memberRepository.findByEmail(email) != null;
    }
}

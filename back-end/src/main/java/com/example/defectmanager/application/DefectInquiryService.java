package com.example.defectmanager.application;


import com.example.defectmanager.domain.entity.Defect;
import com.example.defectmanager.domain.entity.Member;
import com.example.defectmanager.domain.errors.DefectNotFoundException;
import com.example.defectmanager.domain.errors.MemberNotFoundException;
import com.example.defectmanager.domain.repository.DefectRepository;
import com.example.defectmanager.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class DefectInquiryService {

    private final DefectRepository defectRepository;
    private final MemberRepository memberRepository;

    @Transactional
    public Defect getDefectById(Long id) throws DefectNotFoundException {

        Optional<Defect> fetchedDefect = this.defectRepository.findById(id);

        if (fetchedDefect.isPresent()) {
            return fetchedDefect.get();
        }

        throw new DefectNotFoundException("Defect not found by Id of " + id);
    }

    @Transactional
    public List<Defect> getAllDefect() throws DefectNotFoundException {

        List<Defect> defectList = this.defectRepository.findAll();

        if (!CollectionUtils.isEmpty(defectList)) {
            return defectList;
        }

        throw new DefectNotFoundException("Defects not found");
    }

    @Transactional
    public List<Defect> getAllDefectsByDefectHandler(Long defectHandlerId) throws MemberNotFoundException {

        Optional<Member> optionalMember = this.memberRepository.findById(defectHandlerId);

        if (optionalMember.isEmpty()) {
            throw new MemberNotFoundException("Member not found by id of " + defectHandlerId);
        }

        Member defectHandler = optionalMember.get();

        List<Defect> defectList = defectHandler.getListDefect();

        return defectList;
    }

}

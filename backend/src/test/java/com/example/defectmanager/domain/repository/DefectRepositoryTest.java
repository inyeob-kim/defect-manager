package com.example.defectmanager.domain.repository;

import com.example.defectmanager.domain.entity.Defect;
import com.example.defectmanager.domain.entity.Member;
import lombok.RequiredArgsConstructor;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DefectRepositoryTest {

    @Autowired
    DefectRepository defectRepository;

//    @After
//    public void cleanUp() {
//        defectRepository.deleteAll();
//    }

    @Test
    public void saveDefect() {

        Member member = Member.builder()
                .firstName("Inyeob")
                .lastName("Kim")
                .email("inyeob4078@gmail.com")
                .type("1")
                .build();

        Defect defect = Defect.builder()
                .member(member)
                .title("Error testing title")
                .content("There is something wrong with this *** service....")
                .status("1")
                .severity("3")
                .priority("1")
                .type("1")
                .build();

        defectRepository.save(defect);

        System.out.println("defect = " + defect);
    }

}
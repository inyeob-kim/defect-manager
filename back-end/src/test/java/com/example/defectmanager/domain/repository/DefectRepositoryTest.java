package com.example.defectmanager.domain.repository;

import com.example.defectmanager.domain.entity.Defect;
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

    @After
    public void cleanUp() {
        defectRepository.deleteAll();
    }

    @Test
    public void getDefect() {

        // given
        String title = "test defect";
        String content = "test defect content...";
        String type = "1";
        String status = "1";
        String priority = "1";
        String severity = "2";
        Long defectRegistrantId = 000001L;
        Long defectHandlerId = 000002L;

        defectRepository.save(Defect.builder()
                .title(title)
                .content(content)
                .type(type)
                .status(status)
                .priority(priority)
                .severity(severity)
                .defectRegistrantId(defectRegistrantId)
                .defectHandlerId(defectHandlerId)
                .build());

        // when
        List<Defect> defectList = defectRepository.findAll();

        // then
        Defect defect = defectList.get(0);
        assertThat(defect.getTitle().equals(title));
        assertThat(defect.getContent().equals(content));
        assertThat(defect.getType().equals(type));
        assertThat(defect.getStatus().equals(status));
        assertThat(defect.getPriority().equals(priority));
        assertThat(defect.getSeverity().equals(severity));
        assertThat(defect.getDefectRegistrantId().equals(defectRegistrantId));
        assertThat(defect.getDefectHandlerId().equals(defectHandlerId));


    }

}
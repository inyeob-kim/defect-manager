package com.example.defectmanager.presentation;

import com.example.defectmanager.application.dto.DefectRegisterRequestDto;
import com.example.defectmanager.domain.entity.Defect;
import com.example.defectmanager.domain.repository.DefectRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DefectControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private DefectRepository defectRepository;

    @After
    public void tearDown() throws Exception {
        defectRepository.deleteAll();
    }

    @Test
    public void registerDefect() throws Exception {


        // given
        String title = "test defect";
        String content = "test defect content...";
        String type = "1";
        String status = "1";
        String priority = "1";
        String severity = "2";
        Long defectRegistrantId = 000001L;
        Long defectHandlerId = 000002L;

        DefectRegisterRequestDto requestDto = DefectRegisterRequestDto.builder()
                .title(title)
                .content(content)
                .type(type)
                .status(status)
                .priority(priority)
                .severity(severity)
                .defectRegistrantId(defectRegistrantId)
                .defectHandlerId(defectHandlerId)
                .build();

        String url = "http://localhost:" + port + "/api/v1/defect";

        // when
        ResponseEntity<Long> responseEntity = testRestTemplate.postForEntity(url, requestDto, Long.class);

        // then
        assertThat(responseEntity.getStatusCode().is2xxSuccessful());
        assertThat(responseEntity.getBody().longValue() == 0L);

        List<Defect> defectList = defectRepository.findAll();

        assertThat(defectList.get(0).getTitle().equals(title));
        assertThat(defectList.get(0).getContent().equals(content));

        if (log.isDebugEnabled()) {
            log.debug("## DefectControllerTest.registerDefect test finished... ");
        }
    }
}
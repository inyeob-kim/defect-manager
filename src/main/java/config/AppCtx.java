package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import domain.repository.DefectRepository;
import repository.defect.JdbcDefectRepository;

@Configuration
public class AppCtx {

    @Bean
    public DefectRepository defectRepositoy() {
        return new JdbcDefectRepository();
    }
}

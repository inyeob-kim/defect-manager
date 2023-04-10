package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import domain.repository.DefectRepositoy;
import repository.JdbcDefectRepository;

@Configuration
public class AppCtx {

    @Bean
    public DefectRepositoy defectRepositoy() {
        return new JdbcDefectRepository();
    }
}

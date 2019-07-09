package ru.myastrebov.demo.ff4j.config;

import org.ff4j.FF4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author m.yastrebov
 */
@Configuration
public class FF4JConfiguration {

    @Bean
    public FF4j ff4j() {
        return new FF4j("ff4j-features.xml");
    }

}

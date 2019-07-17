package ru.myastrebov.demo.togglz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.myastrebov.demo.feature.v1.DummyResource;
import ru.myastrebov.demo.feature.v2.FriendlyResource;

/**
 * @author m.yastrebov
 */
@SpringBootApplication
public class TogglzApplication {
    public static void main(String[] args) {
        SpringApplication.run(TogglzApplication.class, args);
    }

    @Bean
    public DummyResource dummyResource() {
        return new DummyResource();
    }

    @Bean
    public FriendlyResource friendlyResource() {
        return new FriendlyResource();
    }
}

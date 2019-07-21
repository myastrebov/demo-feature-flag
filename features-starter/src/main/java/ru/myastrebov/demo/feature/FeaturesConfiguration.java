package ru.myastrebov.demo.feature;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.myastrebov.demo.feature.v1.DummyResource;
import ru.myastrebov.demo.feature.v2.FriendlyResource;

/**
 * @author m.yastrebov
 */
@Configuration
public class FeaturesConfiguration {

    @Bean
    DummyResource dummyResource() {
        return new DummyResource();
    }

    @Bean
    FriendlyResource friendlyResource() {
        return new FriendlyResource();
    }
}

package ru.myastrebov.demo.feature;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import ru.myastrebov.demo.feature.v1.DummyResource;
import ru.myastrebov.demo.feature.v2.FriendlyResource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author m.yastrebov
 */
class FeaturesConfigurationTest {

    private ApplicationContextRunner contextRunner;

    @BeforeEach
    void setUp() {
        this.contextRunner = new ApplicationContextRunner()
                .withConfiguration(AutoConfigurations.of(FeaturesConfiguration.class));
    }

    @Test
    void shouldRunConfigurationAndCheckBeansAreExist() throws Exception {
        this.contextRunner.run((context) -> {
            assertThat(context).hasSingleBean(DummyResource.class);
            assertThat(context).hasSingleBean(FriendlyResource.class);
        });
    }
}
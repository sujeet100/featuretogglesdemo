package beingprofessional.featuretogglesdemo.featuretoggles;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(
        classes = FeatureToggleConverter.class,
        properties = {
                "feature.toggles.showFormatted=false",
                "feature.toggles.debug=true"
        })
@EnableConfigurationProperties(FeatureToggles.class)
class FeatureTogglesTest {

    @Autowired
    private FeatureToggles featureToggles;

    @Test
    void itLoadsAllTheCommonFeatureToggles() {
        assertTrue(featureToggles.showFormatted().isDisabled());
        assertTrue(featureToggles.debug().isEnabled());
    }

}

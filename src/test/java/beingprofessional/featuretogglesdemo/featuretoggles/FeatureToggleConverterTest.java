package beingprofessional.featuretogglesdemo.featuretoggles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FeatureToggleConverterTest {

    @Test
    void itShouldConvertPropertyInToFeatureToggle() {
        FeatureToggleConverter toggleConverter = new FeatureToggleConverter();
        FeatureToggle enabledToggle = toggleConverter.convert("true");
        assertNotNull(enabledToggle);
        assertTrue(enabledToggle.isEnabled());

        FeatureToggle disabledToggle = toggleConverter.convert("false");
        assertNotNull(disabledToggle);
        assertFalse(disabledToggle.isEnabled());
    }

}

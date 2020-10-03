package beingprofessional.featuretogglesdemo.featuretoggles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FeatureToggleTest {

    @Test
    void itShouldReturnIsEnabled() {
        assertTrue(new FeatureToggle(true).isEnabled());
        assertFalse(new FeatureToggle(false).isEnabled());
    }

    @Test
    void itShouldReturnIsDisabled() {
        assertTrue(new FeatureToggle(false).isDisabled());
        assertFalse(new FeatureToggle(true).isDisabled());
    }

}

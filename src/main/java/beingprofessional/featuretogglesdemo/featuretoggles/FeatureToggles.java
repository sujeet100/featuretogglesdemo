package beingprofessional.featuretogglesdemo.featuretoggles;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties(prefix = "feature.toggles")
@ConstructorBinding
public class FeatureToggles {
    private final FeatureToggle showFormatted;
    private final FeatureToggle debug;

    public FeatureToggles(FeatureToggle showFormatted, FeatureToggle debug) {
        this.showFormatted = showFormatted;
        this.debug = debug;
    }

    public FeatureToggle showFormatted() {
        return showFormatted;
    }

    public FeatureToggle debug() {
        return debug;
    }
}

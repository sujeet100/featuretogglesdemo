package beingprofessional.featuretogglesdemo;

import beingprofessional.featuretogglesdemo.featuretoggles.FeatureToggle;

public class FeatureTogglesFactory {
    public static final FeatureToggle ENABLED = new FeatureToggle(true);
    public static final FeatureToggle DISABLED = new FeatureToggle(false);
}

package beingprofessional.featuretogglesdemo.featuretoggles;

public class FeatureToggle {

    private final boolean value;

    public FeatureToggle(boolean value) {
        this.value = value;
    }

    public boolean isEnabled() {
        return value;
    }

    public boolean isDisabled() {
        return !value;
    }
}

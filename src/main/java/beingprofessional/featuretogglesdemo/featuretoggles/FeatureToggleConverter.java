package beingprofessional.featuretogglesdemo.featuretoggles;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@ConfigurationPropertiesBinding
@Component
public class FeatureToggleConverter implements Converter<String, FeatureToggle> {

    @Override
    public FeatureToggle convert(String isEnabled) {
        return new FeatureToggle(Boolean.parseBoolean(isEnabled));
    }
}

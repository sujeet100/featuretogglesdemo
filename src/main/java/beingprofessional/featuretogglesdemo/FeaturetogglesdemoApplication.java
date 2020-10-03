package beingprofessional.featuretogglesdemo;

import beingprofessional.featuretogglesdemo.featuretoggles.FeatureToggles;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(FeatureToggles.class)
public class FeaturetogglesdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeaturetogglesdemoApplication.class, args);
    }

}

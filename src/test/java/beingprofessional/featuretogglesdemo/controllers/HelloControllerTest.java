package beingprofessional.featuretogglesdemo.controllers;

import beingprofessional.featuretogglesdemo.FeatureTogglesFactory;
import beingprofessional.featuretogglesdemo.featuretoggles.FeatureToggles;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class HelloControllerTest {

    private HelloController helloController;

    @Mock
    private FeatureToggles featureToggles;

    @BeforeEach
    void beforeEach() {
        helloController = new HelloController(featureToggles);
    }

    @Test
    void itShouldReturnFormattedMessageWhenToggleIsEnabled() {
        when(featureToggles.showFormatted()).thenReturn(FeatureTogglesFactory.ENABLED);
        String message = helloController.hello("Sujit");
        assertThat(message).isEqualTo("<h1>Hello, Sujit</h1>");
    }

    @Test
    void itShouldReturnPlainTextMessageWhenToggleIsDisabled() {
        when(featureToggles.showFormatted()).thenReturn(FeatureTogglesFactory.DISABLED);
        String message = helloController.hello("Sujit");
        assertThat(message).isEqualTo("Hello, Sujit");
    }

}

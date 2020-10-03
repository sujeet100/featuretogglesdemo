package beingprofessional.featuretogglesdemo.controllers;

import beingprofessional.featuretogglesdemo.featuretoggles.FeatureToggles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final FeatureToggles featureToggles;

    @Autowired
    public HelloController(FeatureToggles featureToggles) {
        this.featureToggles = featureToggles;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        if (featureToggles.showFormatted().isEnabled()) {
            return String.format("<h1>Hello, %s</h1>", name);
        } else {
            return String.format("Hello, %s", name);
        }
    }
}

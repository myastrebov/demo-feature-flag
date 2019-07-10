package ru.myastrebov.demo.ff4j;

import org.ff4j.FF4j;
import org.ff4j.spring.autowire.FF4JFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.myastrebov.demo.feature.v1.DummyResource;
import ru.myastrebov.demo.feature.v2.FriendlyResource;

/**
 * @author m.yastrebov
 */
@RestController
public class FeatureController {

    @Autowired
    private DummyResource dummyResource;

    @Autowired
    private FriendlyResource friendlyResource;

    @Autowired
    private FF4j ff4j;

    @FF4JFeature("AwesomeFeature")
    private boolean featureEnabled;

    @GetMapping("/feature-flag/static/if-else/{name}")
    public String useFeatureStatic(@PathVariable String name) {
        return featureEnabled ? friendlyResource.hello(name) : dummyResource.hello(name);
    }

    @GetMapping("/feature-flag/dynamic/if-else/{name}")
    public String useFeatureDynamic(@PathVariable String name) {
        return ff4j.check("AwesomeFeature") ? friendlyResource.hello(name) : dummyResource.hello(name);
    }

    @GetMapping(value = "/", produces = "text/html")
    public String sayHello() {
        return "<html><body><ul>" + "<li> To access the <b>WebConsole</b> please go to <a href=\"" +
                "./ff4j-web-console/home\">ff4j-web-console</a>" +
                "<li> To access the <b>REST API</b> please go to <a href=\"./api/ff4j\">api/ff4j</a>" +
                "<li> To access the <b>Swagger File </b> please go to <a href=\"./v2/api-docs\">/v2/api-docs</a></ul>" +
                "<p>Is <span style=\"color:red\">Awesome</span> feature activated ? from  ff4j.check" +
                "(\"AwesomeFeature\") <span style=\"color:blue\">" +
                ff4j.check("AwesomeFeature") +
                "</span></body></html>";
    }

}

package ru.myastrebov.demo.togglz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.util.NamedFeature;
import ru.myastrebov.demo.feature.v1.DummyResource;
import ru.myastrebov.demo.feature.v2.FriendlyResource;

/**
 * @author m.yastrebov
 */
@RestController
public class FeatureController {

    private static final NamedFeature AWESOME_FEATURE = new NamedFeature("AwesomeFeature");

    @Autowired
    private DummyResource dummyResource;

    @Autowired
    private FriendlyResource friendlyResource;

    @Autowired
    private FeatureManager manager;

    @GetMapping("/feature-flag/dynamic/if-else/{name}")
    public String useFeatureStatic(@PathVariable String name) {
        return manager.isActive(AWESOME_FEATURE) ? friendlyResource.hello(name) : dummyResource.hello(name);
    }

    @GetMapping(value = "/", produces = "text/html")
    public String sayHello() {
        return "<html><body><ul>" + "<li> To access the <b>WebConsole</b> please go to <a href=\"" +
                "./togglz-console/index\">togglz-console/index</a>" +
                "<p>Is <span style=\"color:red\">Awesome</span> feature activated ? " +
                "(\"AwesomeFeature\") <span style=\"color:blue\">" +
                manager.isActive(AWESOME_FEATURE) +
                "</span></body></html>";
    }

}

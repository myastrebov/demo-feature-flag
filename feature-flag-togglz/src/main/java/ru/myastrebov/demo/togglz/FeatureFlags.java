package ru.myastrebov.demo.togglz;

import org.togglz.core.Feature;
import org.togglz.core.annotation.InfoLink;
import org.togglz.core.annotation.Label;
import org.togglz.core.annotation.Owner;
import org.togglz.core.context.FeatureContext;
import ru.myastrebov.demo.togglz.annotation.FeatureOfSprint1;
import ru.myastrebov.demo.togglz.annotation.PermissionFeature;
import ru.myastrebov.demo.togglz.annotation.RedmineIssue;

/**
 * @author m.yastrebov
 */
public enum FeatureFlags implements Feature {

    @RedmineIssue("FF-123")
    @Owner("Yastrebov Maxim")
    /*link to issue in your favorite tracker: jira, redmine, youtrack...*/
    @InfoLink("https://www.togglz.org/")
    @FeatureOfSprint1
    @Label("Friendly resource feature")
    FRIENDLY_RESOURCE,

    @RedmineIssue("FF-321")
    @Owner("Yastrebov Maxim")
    @PermissionFeature
    @Label("Another cool feature")
    ANOTHER_FEATURE;

    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }
}

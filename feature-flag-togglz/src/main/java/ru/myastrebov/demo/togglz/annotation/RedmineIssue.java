package ru.myastrebov.demo.togglz.annotation;

import org.togglz.core.annotation.FeatureAttribute;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author m.yastrebov
 */
@FeatureAttribute("value")
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface RedmineIssue {
    /**
     * Issue number in redmine
     */
    String value();
}

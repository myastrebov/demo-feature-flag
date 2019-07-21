package ru.myastrebov.demo.togglz.annotation;

import org.togglz.core.annotation.FeatureGroup;
import org.togglz.core.annotation.Label;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author m.yastrebov
 */
@Label("Sprint#1")
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@FeatureGroup
public @interface FeatureOfSprint1 {
}

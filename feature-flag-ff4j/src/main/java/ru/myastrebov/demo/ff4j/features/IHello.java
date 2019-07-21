package ru.myastrebov.demo.ff4j.features;

import org.ff4j.aop.Flip;

/**
 * @author m.yastrebov
 */
@Flip(name = "hello.feature", alterClazz = RussianHello.class)
public interface IHello {
    String hello();
}

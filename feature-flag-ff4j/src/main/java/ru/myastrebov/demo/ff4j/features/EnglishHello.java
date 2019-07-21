package ru.myastrebov.demo.ff4j.features;

import org.springframework.stereotype.Service;

/**
 * @author m.yastrebov
 */
@Service
public class EnglishHello implements IHello {
    @Override
    public String hello() {
        return "Hello!";
    }
}

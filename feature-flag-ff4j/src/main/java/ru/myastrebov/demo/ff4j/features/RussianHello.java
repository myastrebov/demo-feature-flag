package ru.myastrebov.demo.ff4j.features;

import org.springframework.stereotype.Service;

/**
 * @author m.yastrebov
 */
@Service
public class RussianHello implements IHello {
    @Override
    public String hello() {
        return "Привет!";
    }
}

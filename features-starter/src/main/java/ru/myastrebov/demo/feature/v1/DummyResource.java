package ru.myastrebov.demo.feature.v1;


import ru.myastrebov.demo.feature.IResource;

/**
 * @author m.yastrebov
 */
public class DummyResource implements IResource {

    @Override
    public String hello(String name) {
        return "Hello, world!";
    }
}

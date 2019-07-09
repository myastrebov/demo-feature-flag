package ru.myastrebov.demo.feature.v2;


import ru.myastrebov.demo.feature.IResource;

/**
 * @author m.yastrebov
 */
public class FriendlyResource implements IResource {

    @Override
    public String hello(String name) {
        return String.format("Hello, %s!", name);
    }
}

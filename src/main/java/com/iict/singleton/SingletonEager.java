package com.iict.singleton;

public class SingletonEager {
    private static SingletonEager singletonEagerInstance = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return singletonEagerInstance;
    }

}

package com.iict.designpattern.singleton;

public class SingleTonMain {
    public static void main(String[] args) {
//        SingletonLazy singletonLazyNew = new SingletonLazy(); // Not possible in single-ton
        SingletonLazy singletonLazyInstance = SingletonLazy.getInstance();
        SingletonLazy singletonLazyInstance1 = SingletonLazy.getInstance();
        System.out.println(singletonLazyInstance.hashCode());
        System.out.println(singletonLazyInstance1.hashCode());
//        System.out.println(singletonLazyNew.hashCode());
        System.out.println("------------------Eager-------------------------");
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        System.out.println(singletonEager1.hashCode());
        System.out.println(singletonEager2.hashCode());
    }
}

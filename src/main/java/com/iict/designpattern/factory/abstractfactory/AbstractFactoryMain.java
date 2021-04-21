package com.iict.designpattern.factory.abstractfactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        Dog dog = (Dog) new AnimalFactory().create("dog");
        System.out.println(dog.getAnimal());
    }
}

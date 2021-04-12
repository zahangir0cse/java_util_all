package com.iict.designpattern.singleton.factory.abstractfactory;

public interface AbstractFactory<T> {
    T create(String animalType) ;
}
package com.iict.designpattern.factory.abstractfactory;

public interface AbstractFactory<T> {
    T create(String animalType) ;
}
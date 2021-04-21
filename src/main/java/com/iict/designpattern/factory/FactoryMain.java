package com.iict.designpattern.factory;

public class FactoryMain {
    public static void main(String[] args) {
        Triangle triangle = (Triangle) new PolygonFactory().getPolygon(3);
        Square square = (Square) new PolygonFactory().getPolygon(4);
        System.out.println(triangle.getType());
        System.out.println(square.getType());
    }
}

package com.iict.bjit;

public class ShapeFactory {

    public Shape getInstance(String name){
        if(name.equals("circle")){
            return new Circle();
        }
        if(name.equals("box")){
            return new Box();
        }
        return null;
    }
}

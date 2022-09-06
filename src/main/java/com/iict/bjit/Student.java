package com.iict.bjit;


@JsonSerial
public class Student {
    int id;
    @JsonElement
    String name;

    @CustomJsonAnnotation
    void toUpperCase(){

    }
}

package com.iict.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final Long serialVersionUID = -23782390930L;
    private String name;
    private String address;
    private transient Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

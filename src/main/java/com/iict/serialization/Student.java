package com.iict.serialization;

import java.io.Serializable;

public class Student implements Serializable {
    private static final Long serialVersionUID = 3484238239892L;
    private String name;
    private String address;
    private transient Integer rollNo;

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

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }
}

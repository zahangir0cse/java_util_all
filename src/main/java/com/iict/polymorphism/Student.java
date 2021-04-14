package com.iict.polymorphism;

public class Student {
    private String name;
    private String address;
    private Integer rollNo;
    private Integer age;

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

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public boolean isValidAge(int age){
        return age >= 18;
    }

    public boolean isValidAge(){
        return this.age >= 18;
    }

}

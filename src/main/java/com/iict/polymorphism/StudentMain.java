package com.iict.polymorphism;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(12);
        System.out.println(student.isValidAge());
        System.out.println(student.isValidAge(19));
        Animal cat = new Cat();
        Animal cow = new Cow();
        cat.eat();
        cow.eat();
    }
}

package com.iict.designpattern.builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    private String name;
    private String address;
    private Long age;

    /* public Employee(EmployeeBuilder builder){
        this.name = builder.name;
        this.address = builder.address;
        this.age = builder.age;
    } */
    /* public static EmployeeBuilder builder(){
        return new EmployeeBuilder();
    }*/

    /* public static class EmployeeBuilder {
        private static String name;
        private static String address;
        private static Long age;

        public EmployeeBuilder address(String address){
            this.address = address;
            return this;
        }

        public static EmployeeBuilder name(String name){
            this.name = name;
            return this;
        }

        public EmployeeBuilder age(Long age){
            this.age = age;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }*/
}

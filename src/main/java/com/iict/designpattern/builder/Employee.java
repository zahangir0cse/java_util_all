package com.iict.designpattern.builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    private String name;
    private String address;
    private Long age;
}

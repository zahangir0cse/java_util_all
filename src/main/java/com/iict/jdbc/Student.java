package com.iict.jdbc;

import lombok.Data;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
public class Student {
    private Integer id;
    private String name;
    private LocalDateTime dob;
}

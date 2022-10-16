package com.iict.jdbc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDAO {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static void insertStudent(Student student) {
        List<Object> parameters = new ArrayList<>();
        parameters.add(student.getId());
        parameters.add(student.getName());
        parameters.add(student.getDob());
        String query = "insert into student (id, name, dob) value(?,?,?)";
        int result = JdbcUtil.insertOrUpdateData(query, parameters);
        if (result > 0) {
            System.out.println("Record Inserted");
        } else {
            System.out.println("Record Not Inserted");
        }
    }

    public static List<Student> getStudentList() throws SQLException, InvocationTargetException, IllegalAccessException {
        Map<String, Object> whereMap = new HashMap<>();
        whereMap.put("id", 1);
        whereMap.put("name", "Masum");
//        whereMap.put("id", 1);
        List<Student> studentList = JdbcUtil.getResultSet(whereMap, Student.class);
        return studentList;
    }
}

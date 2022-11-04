package com.iict.jdbc;

import org.checkerframework.checker.units.qual.A;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) throws SQLException, InvocationTargetException, IllegalAccessException {
        /*Connection con = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tmis_clone","root","1234Zah");
            stmt = con.createStatement();
            int count = 0;
            count = stmt.executeUpdate("insert into role(name) values('Salam')");
            if(count > 0){
                System.out.println("Inserted Successfully.");
            }else{
                System.out.println("Inserted Failed");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            con.close();
            stmt.close();
        }*/
//        System.out.println(getBinaryFromDecimal(2, 1));
        /*int[] changed = {1, 4, 2, 1};
        findOriginalArray(changed);
        System.out.println(new Date());*/
        Student student = new Student();
        student.setId(3);
        student.setName("Masum 21");
        student.setDob(LocalDateTime.now());
//        StudentDAO.insertStudent(student);
        StudentDAO.getStudentList();
    }

    private static String getBinaryFromDecimal(int k, int d){
        StringBuilder binaryBuilder = new StringBuilder();
//        AService aService = new AService(new BService())
        while(d > 0){
            int binary = d % 2;
            d = d / 2;
            binaryBuilder.append(binary);
        }
        binaryBuilder.reverse();
        return String.format("%02d", Integer.valueOf(binaryBuilder.toString()));
    }

    public static int[] findOriginalArray(int[] changed) {
        if(changed.length % 2 != 0){
            return new int[0];
        }
        int [] result = new int[changed.length / 2];
        List<Integer> intList = Arrays.stream(changed).boxed().collect(Collectors.toList());
        int doubleVal = 0;
        int index = 0;
        for(int i: changed){
            if(intList.size() == 0){
                return result;
            }
            doubleVal = i * 2;
            if(doubleVal == 0 && Collections.frequency(intList, 0) < 2){
                return new int[0];
            }
            if(intList.contains(doubleVal)){
                intList.remove(intList.indexOf(i));
                intList.remove(intList.indexOf(doubleVal));
                result[index++] = i;
            }
        }
        return intList.size() == 0?result:new int[0];
    }
}

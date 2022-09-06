package com.iict.jdbc;

import org.checkerframework.checker.units.qual.A;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) throws SQLException {
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
        System.out.println(getBinaryFromDecimal(2, 1));
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
}

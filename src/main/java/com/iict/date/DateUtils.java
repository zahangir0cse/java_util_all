package com.iict.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static void main(String[] args) throws ParseException {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS").parse("2021-06-20T08:54:00.000"));
    }
}

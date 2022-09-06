package com.iict.passwordencoder;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PasswordEncoder {
    public static void main(String[] args) {
        System.out.printf(String.valueOf(true));
        String password = "admin123";
        String SHIP_REPORT_RANGE_QUERY_BY_JOURNEY_DATE = "SELECT \n" +
                "    new_booking.created_date,\n" +
                "    new_booking.ship_name,\n" +
                "    SUM(new_booking.price) AS total_price,\n" +
                "    SUM(new_booking.seats) AS total_seat\n" +
                "FROM\n" +
                "    (SELECT \n" +
                "        DATE_FORMAT(b.created, '%Y-%m-%d') AS created_date,\n" +
                "            (SELECT \n" +
                "                    CONCAT(ls.name, '-', ls.ship_Number)\n" +
                "                FROM\n" +
                "                    l_ship ls\n" +
                "                WHERE\n" +
                "                    ls.id = b.ship_id) AS ship_name,\n" +
                "            (SELECT \n" +
                "                    COUNT(*)\n" +
                "                FROM\n" +
                "                    l_booking_subBookingList lbs\n" +
                "                WHERE\n" +
                "                    lbs.l_booking_id = b.id) AS seats,\n" +
                "            b.totalPayablePrice AS price\n" +
                "    FROM\n" +
                "        l_booking b\n" +
                "    WHERE\n" +
                "        ship_id IN (:shipIds) \n" +
                "        AND b.cancelled = 0\n" +
                "        AND b.eStatus in (2)\n" +
                "            AND b.booking_date BETWEEN STR_TO_DATE(:fromDate, '%Y-%m-%d') AND STR_TO_DATE(:toDate, '%Y-%m-%d')) AS new_booking\n" +
                "GROUP BY new_booking.created_date , new_booking.ship_name  order by new_booking.created_date asc";
        System.out.println(SHIP_REPORT_RANGE_QUERY_BY_JOURNEY_DATE);
        System.out.println(LocalDateTime.now());
//        System.out.println(password.substring(0, password.lastIndexOf(",")));
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(password);
        System.out.println(hashedPassword);
        process(null);
    }
    private static void process(Object o){
        System.out.println("hello object");
    }

    private static void process(String s){
        System.out.println("hello s");
    }
}

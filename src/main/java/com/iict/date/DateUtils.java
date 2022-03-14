package com.iict.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;

public class DateUtils {
    private static final String LONDON_TIME_ZONE = "Europe/London";
    public static void main(String[] args) throws ParseException {
//        System.out.println(getCurrentZonedDate(LONDON_TIME_ZONE));


        TimeZone tz = TimeZone.getTimeZone("Europe/London");

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        df.setTimeZone(tz);

        Date now = new Date();
        String nowStr = df.format(now);
        System.out.println(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(nowStr));
        System.out.println(nowStr);
    }

    public static Date getCurrentZonedDate(String zoneName){
//        String systemLocalDateTimeString = LocalDateTime.now().format(DateTimeFormatter.ofPattern(DATE_FORMAT_TIME));
        LocalDateTime systemLocalDateTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.of(zoneName);
        ZonedDateTime zonedDateTime = systemLocalDateTime.atZone(zoneId);
//        LocalDateTime localDateTime = LocalDateTime.from(zonedDateTime);
        String dateFormat = "dd/MM/yyyy hh:mm:ss a";
        System.out.println(new SimpleDateFormat(dateFormat).format(Date.from(zonedDateTime.toInstant())));
        return Date.from(zonedDateTime.toInstant());

    }
}

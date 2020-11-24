package com.xw.j2se.classes;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {

    public static void main(String[] args) {

        //为了日历时间的国际化，Java8开始提供 util.date相关类

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        //LocalDate只有年月日
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.format(formatter));
        LocalDateTime now = localDate.atTime(LocalTime.of(8,8,8));
        System.out.println(now.format(dateTimeFormatter));
        //LocalTime只有时分秒 支持纳秒
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.format(timeFormatter));
        //LocalDateTime 时分秒 年月日
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(dateTimeFormatter));

        System.out.println("---------------------------------------------");
        //本初子午线为标准的时间 未加时区
        Instant instant = Instant.now();
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        LocalDateTime offsetLocalDateTime = offsetDateTime.toLocalDateTime();
        System.out.println(offsetDateTime.format(dateTimeFormatter));
        System.out.println(offsetLocalDateTime.format(dateTimeFormatter));
    }
}

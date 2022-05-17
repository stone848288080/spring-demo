package top.ximimi.springdemo.java8;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {


    @Test
    public void testLocalDateTime(){

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd HH:mm:ss.A");
        String format = timeFormatter.format(localDateTime);
        System.out.println(format);
    }

}

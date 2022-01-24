package com.example.employee.DateAndTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DemoLocalDateAndPeriod {
    public static void main(String[] a){
        LocalDate date = LocalDate.of(1997, Month.MAY,23);
        LocalDate date2 = LocalDate.of(1998, Month.MAY,22);
        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        Period period = Period.between(date,date2);
        System.out.println(period +" "+ period.get(ChronoUnit.DAYS));
        System.out.println(date.format(DTF)); // convert date to string in particular format
        System.out.println(LocalDate.parse("20/Aug/1998",DTF)); // string to date in particular format
        // DTF == "20/Aug/1998"
        // parse requires yyyy-MM-dd format or you can use custom format by using DateTimeformatter as above example
    }
}

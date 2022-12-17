package com.example.employee.interviewproblems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
// 17122022 to 17/dec/2022
public class Dates {
        public static void main(String[] args) {
            String s = "17122022";
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy");
            LocalDate date = LocalDate.parse(s,dtf);
            System.out.println(date.format(DateTimeFormatter.ofPattern("dd/MMM/yyyy")));

        }
}

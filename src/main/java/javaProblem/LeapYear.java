package javaProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class LeapYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer year = Integer.valueOf(br.readLine());
        System.out.println(isLeapYear(year));
        System.out.println(isLeapYearWithLocalDate(year));
    }

    private static boolean isLeapYearWithLocalDate(Integer year) {
        LocalDate ld = LocalDate.of(year,1,1);
        return ld.isLeapYear();
    }

    private static boolean isLeapYear(Integer year) {
        boolean isLeapYear = false;
        if(year%400 == 0 || (year%4==0 && year%100!=0)){
            isLeapYear = true;
        }
        return isLeapYear;
    }
}

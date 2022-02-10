package javaProblem.convertfromonetoanotherdatatype;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class String2Date {
    public static void main(String[] args){
        String string ="09/07/2021";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(date);
    }
}

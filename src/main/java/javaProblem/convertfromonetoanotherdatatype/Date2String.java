package javaProblem.convertfromonetoanotherdatatype;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date2String {
    public static void main(String[] args){
        LocalDate date = LocalDate.of(1997,9,07);
        String string = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(string);
    }
}

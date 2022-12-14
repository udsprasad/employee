package com.example.employee.interviewproblems;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class ItemPrice{
    private Integer price;
    private LocalDate startDate;
    private LocalDate lastDate;
}

public class ThirdRoundOracle {
    public static void main(String[] args) {
        if (validationMethod(ItemPrice.builder().price(18).startDate(LocalDate.of(2022, Month.MARCH, 1))
                .lastDate(LocalDate.of(2022, Month.JULY, 21)).build())) {
            System.out.println("run sql query");

        } else {
            System.out.println("doesn't run sql query");
        }
    }
    public static  boolean validationMethod(ItemPrice itemPrice){
        List<ItemPrice> list = new ArrayList<ItemPrice>(){{
            add(ItemPrice.builder().price(10).startDate(LocalDate.of(2021, Month.JANUARY,1))
                    .lastDate(LocalDate.of(2021, Month.JANUARY,10)).build());
            add(ItemPrice.builder().price(15).startDate(LocalDate.of(2021, Month.JANUARY,11))
                    .lastDate(LocalDate.of(2021, Month.JUNE,30)).build());
            add(ItemPrice.builder().price(10).startDate(LocalDate.of(2021, Month.AUGUST,1))
                    .lastDate(LocalDate.of(2021, Month.AUGUST,15)).build());
        }};
        boolean flag = true;
        for(ItemPrice i : list){
            System.out.println(i.getStartDate().isBefore(itemPrice.getStartDate()));
            if(!(i.getStartDate().isBefore(itemPrice.getStartDate())&& i.getLastDate().isBefore(itemPrice.getStartDate()) &&
                    i.getStartDate().isBefore(itemPrice.getLastDate())&& i.getLastDate().isBefore(itemPrice.getLastDate()))){
                flag = false;
                break;
            }
        }
        return flag;
    }
}

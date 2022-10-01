package com.example.employee.interviewproblems;

import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
class Student {
    // this will include only id for hashcode and equals
    @EqualsAndHashCode.Include
    private Long id;
    private String firstname;
    private String lastname;
}

public class FindDuplicateValuesByID {
    public static void main(String[] args){
        List<Student> list = new ArrayList<>(){{
            add(Student.builder().id(1L).firstname("raju").lastname("rr").build());
            add(Student.builder().id(1L).firstname("ramesh").lastname("k").build());
            add(Student.builder().id(2L).firstname("ganesh").lastname("l").build());
            add(Student.builder().id(3L).firstname("arjun").lastname("j").build());
        }};

        Set<Student> s = new HashSet<>();
        list.forEach(student -> {
            if(!s.add(student)){
                System.out.println(student);
            }
        });


    }
}

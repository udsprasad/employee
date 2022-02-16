package com.example.employee.dao;

import com.example.employee.jpa.FullTime;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

@DataJpaTest
public class FullTimeRepoTest {

    @Autowired
    FullTimeRepo fullTimeRepo;

    @Before
    public void setUp(){
    fullTimeRepo.save(FullTime.builder().firstName("ram").lastName("gopal").fullTime(true).build());

    }
    @Test
    public void Test(){
        fullTimeRepo.save(FullTime.builder().firstName("ram").lastName("gopal").fullTime(true).build());
        System.out.println(fullTimeRepo.findById(1L).get());

    }
}

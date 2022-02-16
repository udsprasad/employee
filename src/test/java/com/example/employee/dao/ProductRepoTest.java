package com.example.employee.dao;

import com.example.employee.jpa.Book;
import com.example.employee.jpa.Product;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SpringBootTest
public class ProductRepoTest {

    @Autowired
    ProductRepo ProductRepo;

    @PersistenceContext
    EntityManager em;


    @Test
    public void test() {
        Book book = new Book(1,"hai","bye");
        ProductRepo.save(book);
        System.out.println(ProductRepo.findByName("hai"));
    }
}

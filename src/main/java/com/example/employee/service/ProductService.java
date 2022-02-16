package com.example.employee.service;

import com.example.employee.dao.ProductRepo;
import com.example.employee.jpa.Book;
import com.example.employee.jpa.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public void test(){
        System.out.println(productRepo.save(new Book(1,"hai","raju")));
        System.out.println(productRepo.findByProductId("hai"));
    }
}

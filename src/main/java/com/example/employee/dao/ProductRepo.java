package com.example.employee.dao;

import com.example.employee.jpa.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;


@Repository
public interface ProductRepo extends JpaRepository<Product, Serializable> {

    @Query(value = "select * from product where name = ?1 ",nativeQuery = true)
    List<Product> findByProductId(String name);

    Product findByName(String name);
}

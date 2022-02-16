package com.example.employee.jpa;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@ToString
@DiscriminatorValue("1")
public class Book extends Product{
    private String author;

    public Book() {
        super();

    }

    public Book(long productId, String name, String author) {
        super(productId, name);
        this.author=author;
    }
}

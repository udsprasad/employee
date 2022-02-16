package com.example.employee.jpa;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@ToString
@DiscriminatorValue("2")
public class Pen extends Product {
    private String color;

    public Pen() {
    }

    public Pen(long productId, String name, String color) {
        super(productId, name);
        this.color=color;
    }
}

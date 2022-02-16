package com.example.employee.jpa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Inheritance
@ToString
@DiscriminatorColumn(name="product_type",
                     discriminatorType = DiscriminatorType.INTEGER)
public class Product {
    @Id
    private long productId;
    private String name;

    public Product() {
    }

    public Product(long productId, String name) {
        this.productId = productId;
        this.name = name;
    }
}

package com.example.shopcart.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @SequenceGenerator(name = "product_sequence",sequenceName = "product_sequence",
                        allocationSize = 1)
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "product_sequence")
    private Long Id;
    private String name;
    private String description;
    transient Price price; //TODO - check whether to keep or remove 'transient'

    public Product(String name, String description, Price price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}

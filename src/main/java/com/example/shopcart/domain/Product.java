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
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String description;
    @OneToOne(mappedBy = "product")
    Price price; //TODO - check whether to keep or remove 'transient'

    public Product(String name, String description, Price price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}

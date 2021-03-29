package com.example.shopcart.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @SequenceGenerator(name = "product_sequence",sequenceName = "product_sequence",
                        allocationSize = 1)
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "product_sequence")
    private int Id;
    private String name;
    private String description;
    transient Price price; //TODO - check whether to keep or remove 'transient'

}

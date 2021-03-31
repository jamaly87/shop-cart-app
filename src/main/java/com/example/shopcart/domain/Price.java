package com.example.shopcart.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Price {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private Long productId;
    @OneToOne
    @PrimaryKeyJoinColumn(name="product_id")
    Product product;
    private double price;
    private int discountPercentage;


}

package com.example.shopcart.entity;

import lombok.*;

import javax.persistence.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long pId;
    @Column(nullable = false,columnDefinition = "TEXT")
    private String productName;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column(nullable = false)
    private double price;




}

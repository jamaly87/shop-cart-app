package com.example.shopcart.entity;

import lombok.*;

import javax.persistence.*;

@Data
@ToString
@NoArgsConstructor
@Entity

public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false,columnDefinition = "TEXT")
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column(nullable = false)
    private double price;




}

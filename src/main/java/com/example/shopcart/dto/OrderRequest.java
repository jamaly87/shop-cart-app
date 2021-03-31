package com.example.shopcart.dto;

import com.example.shopcart.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class OrderRequest {

    private Customer customer;
}

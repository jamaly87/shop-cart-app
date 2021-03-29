package com.example.shopcart.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> items = new ArrayList<>();
    private double cartTotal;
    private double cartDiscount;
    private double checkoutPrice;
}

package com.hamza.foodordringsystem.orderdomaincore.entity;

import com.hamza.foodordringsystem.commondomain.entity.BaseEntity;
import com.hamza.foodordringsystem.commondomain.valueobject.Money;
import com.hamza.foodordringsystem.commondomain.valueobject.ProductId;

public class Product extends BaseEntity<ProductId> {

    private String name;
    private Money price;

    public Product(ProductId productId, String name, Money price) {
       super.setId(productId);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }
}

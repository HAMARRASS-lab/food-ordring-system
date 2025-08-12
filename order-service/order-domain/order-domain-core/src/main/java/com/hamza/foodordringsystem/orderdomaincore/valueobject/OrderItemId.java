package com.hamza.foodordringsystem.orderdomaincore.valueobject;

import com.hamza.foodordringsystem.commondomain.entity.BaseEntity;
import com.hamza.foodordringsystem.commondomain.valueobject.BaseId;
import com.hamza.foodordringsystem.commondomain.valueobject.OrderId;
import com.hamza.foodordringsystem.commondomain.valueobject.ProductId;
import com.hamza.foodordringsystem.orderdomaincore.entity.Product;

public class OrderItemId extends BaseEntity<OrderItemId> {
    private OrderId orderId;
    private final Product product;


    public OrderItemId(Product product) {
        this.product = product;
    }
}

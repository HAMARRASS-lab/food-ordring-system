package com.hamza.foodordringsystem.orderdomaincore.event;

import com.hamza.foodordringsystem.commondomain.event.DomainEvent;
import com.hamza.foodordringsystem.orderdomaincore.entity.Order;

import java.time.ZonedDateTime;

public class OrderCreateEvent implements DomainEvent<Order> {

    private final Order order;
    private final ZonedDateTime createdAt;

    public OrderCreateEvent(Order order, ZonedDateTime createdAt) {
        this.order = order;
        this.createdAt = createdAt;
    }

    public Order getOrder() {
        return order;
    }
    public ZonedDateTime getCreatedAt() {
        return createdAt;

    }
}

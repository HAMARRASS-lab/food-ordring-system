package com.hamza.foodordringsystem.orderdomaincore.event;

import com.hamza.foodordringsystem.commondomain.event.DomainEvent;
import com.hamza.foodordringsystem.orderdomaincore.entity.Order;

import java.time.ZonedDateTime;

public class OrderCancelEvent extends OrderEvent {

    public OrderCancelEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}

package com.hamza.foodordringsystem.orderdomaincore.event;

import com.hamza.foodordringsystem.commondomain.event.DomainEvent;
import com.hamza.foodordringsystem.orderdomaincore.entity.Order;

import java.time.ZonedDateTime;

public class OrderPaidEvent extends OrderEvent {


    public OrderPaidEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}

package com.hamza.foodordringsystem.orderdomaincore;

import com.hamza.foodordringsystem.orderdomaincore.entity.Order;
import com.hamza.foodordringsystem.orderdomaincore.entity.Restaurant;
import com.hamza.foodordringsystem.orderdomaincore.event.OrderCancelEvent;
import com.hamza.foodordringsystem.orderdomaincore.event.OrderCreateEvent;
import com.hamza.foodordringsystem.orderdomaincore.event.OrderPaidEvent;

import java.util.List;

public interface OrderDomainService {

   OrderCreateEvent validateAndInitiateOrder(Order order, Restaurant restaurant);

   OrderPaidEvent payOrder(Order order);

   void approveOrder(Order order);

   OrderCancelEvent cancelOrderPayment(Order order, List<String> failureMessages);

   void cancelOrder(Order order, List<String> failureMessages);
}

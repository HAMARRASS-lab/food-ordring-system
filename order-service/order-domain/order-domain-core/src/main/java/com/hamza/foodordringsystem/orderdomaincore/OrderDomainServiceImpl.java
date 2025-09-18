package com.hamza.foodordringsystem.orderdomaincore;

import com.hamza.foodordringsystem.orderdomaincore.entity.Order;
import com.hamza.foodordringsystem.orderdomaincore.entity.Product;
import com.hamza.foodordringsystem.orderdomaincore.entity.Restaurant;
import com.hamza.foodordringsystem.orderdomaincore.event.OrderCancelEvent;
import com.hamza.foodordringsystem.orderdomaincore.event.OrderCreateEvent;
import com.hamza.foodordringsystem.orderdomaincore.event.OrderPaidEvent;
import com.hamza.foodordringsystem.orderdomaincore.exception.OrderDomainException;
import lombok.extern.slf4j.Slf4j;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

@Slf4j
public class OrderDomainServiceImpl implements OrderDomainService {

    private static final String UTC = "UTC";

    @Override
    public OrderCreateEvent validateAndInitiateOrder(Order order, Restaurant restaurant) {

       validateRestaurant(restaurant);
       setOrderProductInformation(order, restaurant);
       order.validateOrder();
       order.initializeOrder();
       log.info("Order with id {} has been created", order.getId().getValue());
        return new OrderCreateEvent(order, ZonedDateTime.now(ZoneId.of("UTC")));
    }

    @Override
    public OrderPaidEvent payOrder(Order order) {
          order.pay();
          log.info("Order with id {} has been paid", order.getId().getValue());

        return new OrderPaidEvent(order, ZonedDateTime.now(ZoneId.of("UTC")));

    }

    @Override
    public void approveOrder(Order order) {
        order.approve();
        log.info("Order with id {} has been approved", order.getId().getValue());

    }

    @Override
    public OrderCancelEvent cancelOrderPayment(Order order, List<String> failureMessages) {
        order.initCancel(failureMessages);
        log.info("Order with id {} has been cancelled", order.getId().getValue());
        return new OrderCancelEvent(order, ZonedDateTime.now(ZoneId.of("UTC")));
    }

    @Override
    public void cancelOrder(Order order, List<String> failureMessages) {
        order.cancel(failureMessages);
        log.info("Order with id {} has been cancelled", order.getId().getValue());


    }

    private void validateRestaurant(Restaurant restaurant) {
        if(!restaurant.isActive()){
            throw new OrderDomainException("Restaurant with id" + restaurant.getId().getValue() + " is not active!");
        }

    }
    private void setOrderProductInformation(Order order, Restaurant restaurant) {
        order.getItems().forEach(orderItem -> restaurant.getProduct().forEach(restaurantPdoduct ->{
         Product currentProduct = orderItem.getProduct();
          if(currentProduct.equals(restaurantPdoduct)){
              currentProduct.updateWithConfirmeNameAndPrice(restaurantPdoduct.getName(), restaurantPdoduct.getPrice());
          }
        }));

    }

}

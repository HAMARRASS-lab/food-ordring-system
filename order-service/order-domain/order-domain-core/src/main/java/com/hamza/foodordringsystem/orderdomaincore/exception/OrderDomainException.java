package com.hamza.foodordringsystem.orderdomaincore.exception;

import com.hamza.foodordringsystem.commondomain.exception.DomainException;

public class OrderDomainException extends DomainException {

    public OrderDomainException(String message) {
        super(message);
    }

    public OrderDomainException(String message, Throwable cause) {
        super(message, cause);
    }
}

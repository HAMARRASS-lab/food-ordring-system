package com.hamza.foodordringsystem.commondomain.valueobject;

import java.util.UUID;

public class CustomerId extends BaseId<UUID> {
    protected CustomerId(UUID value) {
        super(value);
    }
}

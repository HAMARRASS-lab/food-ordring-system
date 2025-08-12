package com.hamza.foodordringsystem.orderdomaincore.valueobject;

import com.hamza.foodordringsystem.commondomain.valueobject.BaseId;

import java.awt.*;
import java.util.UUID;

public class TrackingId extends BaseId<UUID> {

    public TrackingId(UUID value) {
        super(value);
    }
}

package com.hamza.foodordringsystem.orderdomaincore.entity;

import com.hamza.foodordringsystem.commondomain.entity.AggregateRoot;
import com.hamza.foodordringsystem.commondomain.valueobject.RestaudantId;

import java.util.List;

public class Restaurant extends AggregateRoot<RestaudantId> {

    private final List<Product> product;
    private boolean active;

    private Restaurant(Builder builder) {
        super.setId(builder.restaudantId) ;
        product = builder.product;
        active = builder.active;
    }


    public List<Product> getProduct() {
        return product;
    }

    public boolean isActive() {
        return active;
    }

    public static final class Builder {
        private RestaudantId restaudantId ;
        private List<Product> product;
        private boolean active;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder restaudantId(RestaudantId val) {
            restaudantId = val;
            return this;
        }

        public Builder product(List<Product> val) {
            product = val;
            return this;
        }

        public Builder active(boolean val) {
            active = val;
            return this;
        }

        public Restaurant build() {
            return new Restaurant(this);
        }
    }
}

package com.hamza.foodordringsystem.commondomain.entity;

import com.hamza.foodordringsystem.commondomain.valueobject.RestaudantId;

import java.util.Objects;

public abstract class BaseEntity<ID> {

    private ID id;

    public ID getId() {
        return id;
    }

    public static void setId(RestaudantId id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity<?> that = (BaseEntity<?>) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

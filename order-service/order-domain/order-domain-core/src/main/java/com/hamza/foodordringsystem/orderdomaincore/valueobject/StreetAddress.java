package com.hamza.foodordringsystem.orderdomaincore.valueobject;

import java.util.Objects;
import java.util.UUID;

public class StreetAddress {

    private final UUID id;
    private final String street;
    private final String postcode;
    private final String city;


    public StreetAddress(UUID id, String street, String postcode, String city) {
        this.id = id;
        this.street = street;
        this.postcode = postcode;
        this.city = city;
    }

    public UUID getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StreetAddress that = (StreetAddress) o;
        return Objects.equals(street, that.street) && Objects.equals(postcode, that.postcode) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, postcode, city);
    }
}

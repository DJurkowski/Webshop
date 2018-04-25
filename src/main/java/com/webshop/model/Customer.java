package com.webshop.model;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Customer extends Person {


    private Long customerNumber;
    private String address;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private Integer creditLimit;

    @OneToOne(mappedBy = "customer")
    private Paymanet paymanet;

    public Customer(String firstName, String secondName, String email, String phone, Long customerNumber, String address, String city, String state, String postalCode, String country, Integer creditLimit, Paymanet paymanet) {
        super(firstName, secondName, email, phone);
        this.customerNumber = customerNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.creditLimit = creditLimit;
        this.paymanet = paymanet;
    }

    public Long getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Long customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Paymanet getPaymanet() {
        return paymanet;
    }

    public void setPaymanet(Paymanet paymanet) {
        this.paymanet = paymanet;
    }
}

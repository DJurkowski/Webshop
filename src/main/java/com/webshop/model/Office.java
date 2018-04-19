package com.webshop.model;

public class Office {

    private Long officeCode;
    private String address;
    private String state;
    private String country;
    private String postalCode;

    public Office(Long officeCode, String address, String state, String country, String postalCode) {
        this.officeCode = officeCode;
        this.address = address;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;
    }

    public Long getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(Long officeCode) {
        this.officeCode = officeCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}

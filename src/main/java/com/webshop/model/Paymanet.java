package com.webshop.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Paymanet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long checkNumber;
    private Date paymentDate;
    private Float amount;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerNumber")
    private Customer customer;

    public Paymanet(Long checkNumber, Date paymentDate, Float amount, Customer customer) {
        this.checkNumber = checkNumber;
        this.paymentDate = paymentDate;
        this.amount = amount;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(Long checkNumber) {
        this.checkNumber = checkNumber;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
}

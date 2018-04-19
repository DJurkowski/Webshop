package com.webshop.model;

public class Employee extends Person {

    private Long id;
    private Long officeCode;
    private JobTitle jobTitle;

    public Employee(String firstName, String secondName, String email, String phone, Long id, Long officeCode, JobTitle jobTitle) {
        super(firstName, secondName, email, phone);
        this.id = id;
        this.officeCode = officeCode;
        this.jobTitle = jobTitle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(Long officeCode) {
        this.officeCode = officeCode;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }
}

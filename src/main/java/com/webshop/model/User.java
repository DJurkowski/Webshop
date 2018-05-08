package com.webshop.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min = 2, max = 20, message = "Nickname must have from 2 to 20 chars")
    private String nick;
    @NotNull(message = "You must add your first name")
    private String firstName;
    @NotNull(message = "You must add your second name")
    private String secondName;
    @NotNull(message = "You must add your address email")
    @Email(message = "Address email is invalid")
    private String email;
    @NotNull(message = "You must add your phone number")
    @Pattern(regexp = "\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{3}", message = "Pattern: XXX-XXX-XXX")
    private String phone;
    @NotNull(message = "You must add your age")
    @Digits(integer = 150, fraction = 3,message = "Age is a digit")
    @Min(value = 18, message = "Musisz mieć 18 lat")
    private Integer age;
    @NotNull(message = "You must add your city")
    private String city;
    @NotNull(message = "You must add your state")
    private String state;
    @NotNull(message = "You must add your postal code")
    @Pattern(regexp = "[0-9]{2}\\-[0-9]{3}", message = "Pattern: XX-XXX")
    private String postalCode;
    @NotNull
    private String password;
    @Transient
    private String re_password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRe_password() {
        return re_password;
    }

    public void setRe_password(String re_password) {
        this.re_password = re_password;
    }
}

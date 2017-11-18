package com.hendisantika.springbootorders.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-orders
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/11/17
 * Time: 06.43
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class Customer {
    @Id
    @Column(name = "customerId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long customerId;
    String cusFirstname;
    String cusLastname;
    String cusEmail;
    String cusPhoneNo;
    String cusCity;
    String cusProvince;
    String cusCountry;


    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "orderId")
    @JoinTable(name = "customer_order", joinColumns = {@JoinColumn(name = "customerId")}, inverseJoinColumns = {@JoinColumn(name = "orderId")})
    Set<Orders> orders = new HashSet<Orders>(0);

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }

    public String getCusFirstname() {
        return cusFirstname;
    }

    public void setCusFirstname(String cusFirstname) {
        this.cusFirstname = cusFirstname;
    }

    public String getCusLastname() {
        return cusLastname;
    }

    public void setCusLastname(String cusLastname) {
        this.cusLastname = cusLastname;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public String getCusPhoneNo() {
        return cusPhoneNo;
    }

    public void setCusPhoneNo(String cusPhoneNo) {
        this.cusPhoneNo = cusPhoneNo;
    }

    public String getCusCity() {
        return cusCity;
    }

    public void setCusCity(String cusCity) {
        this.cusCity = cusCity;
    }

    public String getCusProvince() {
        return cusProvince;
    }

    public void setCusProvince(String cusProvince) {
        this.cusProvince = cusProvince;
    }

    public String getCusCountry() {
        return cusCountry;
    }

    public void setCusCountry(String cusCountry) {
        this.cusCountry = cusCountry;
    }

    public Customer() {
    }

    public Customer(String cusFirstname, String cusLastname, String cusEmail, String cusPhoneNo, String cusCity, String cusProvince, String cusCountry, Set<Orders> orders) {
        this.cusFirstname = cusFirstname;
        this.cusLastname = cusLastname;
        this.cusEmail = cusEmail;
        this.cusPhoneNo = cusPhoneNo;
        this.cusCity = cusCity;
        this.cusProvince = cusProvince;
        this.cusCountry = cusCountry;
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "customerId = " + customerId + " , cusFirstname = " + cusFirstname + " , cusLastname = " + cusLastname +
                " , cusEmail = " + cusEmail + " , cusPhoneNo = " + cusPhoneNo + " , cusCity = " + cusCity +
                ", cusProvince = " + cusProvince + " , cusCountry = " + cusCountry;
    }
}

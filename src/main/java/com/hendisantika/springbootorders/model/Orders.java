package com.hendisantika.springbootorders.model;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-orders
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/11/17
 * Time: 06.48
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class Orders {
    @Id
    @Column(name="orderID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int orderID;

    //@OneToOne(mappedBy = "orders")
    int customerId;
    //Customer customer;


    double totalAmount;

    public int getOrderID() {
        return orderID;
    }
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    @Override
    public String toString(){
        return "orderID = " + orderID + " , customerId = " + customerId + " , totalAmount = " + totalAmount;
    }

}

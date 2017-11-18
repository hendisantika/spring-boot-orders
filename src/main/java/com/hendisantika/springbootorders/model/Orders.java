package com.hendisantika.springbootorders.model;

import javax.persistence.*;
import java.util.Set;

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
    @Column(name = "orderId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long orderId;

    @ManyToMany(mappedBy = "orders")
    Set<Customer> customer;

    double totalAmount;

    public Long getOrderID() {
        return orderId;
    }

    public void setOrderID(Long orderId) {
        this.orderId = orderId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Set<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(Set<Customer> customer) {
        this.customer = customer;
    }

    public Orders() {
    }


    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", totalAmount=" + totalAmount +
                '}';
    }
}

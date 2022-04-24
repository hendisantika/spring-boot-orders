package com.hendisantika.springbootorders.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @Column(name = "productId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long productId;

    String productName;

    String productDescription;

    double unitPrice;

    @ManyToOne
    @JoinColumn(name = "orderID")
    OrderDetails orderDetails;


    public Product(String productName, String productDescription, double unitPrice, OrderDetails orderDetails) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.unitPrice = unitPrice;
        this.orderDetails = orderDetails;
    }

}

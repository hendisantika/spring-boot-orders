package com.hendisantika.springbootorders.model;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-orders
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/11/17
 * Time: 06.49
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class OrderDetails {
    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int orderDetailsNo;
    int orderID;
    int productId;
    int quantity;
    double subtotal;

    public int getOrderDetailsNo() {
        return orderDetailsNo;
    }
    public void setOrderDetailsNo(int orderDetailsNo) {
        this.orderDetailsNo = orderDetailsNo;
    }
    public int getOrderID() {
        return orderID;
    }
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString(){
        return "orderDetailsNo = " + orderDetailsNo + " , orderID = " + orderID + " , productId = " + productId
                + " , quantity = " + quantity + " , subtotal = " + subtotal;
    }
}

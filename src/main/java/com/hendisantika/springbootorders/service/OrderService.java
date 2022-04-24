package com.hendisantika.springbootorders.service;

import com.hendisantika.springbootorders.model.Customer;
import com.hendisantika.springbootorders.model.Orders;
import com.hendisantika.springbootorders.model.Product;
import com.hendisantika.springbootorders.repository.CustomerRepo;
import com.hendisantika.springbootorders.repository.OrderRepo;
import com.hendisantika.springbootorders.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-orders
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/04/22
 * Time: 12.20
 */
@Service
@RequiredArgsConstructor
public class OrderService {
    private final CustomerRepo customerRepository;
    private final ProductRepository productRepository;
    private final OrderRepo orderRepository;

    public Iterable<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public List<Orders> findAllOrders() {
        return orderRepository.findAll();
    }
}

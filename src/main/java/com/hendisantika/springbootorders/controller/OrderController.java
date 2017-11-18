package com.hendisantika.springbootorders.controller;

import com.hendisantika.springbootorders.model.Orders;
import com.hendisantika.springbootorders.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-orders
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/11/17
 * Time: 19.30
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    OrderRepo orderRepo;

    @GetMapping
    ResponseEntity<List<Orders>> getOrders(){
        return new ResponseEntity<List<Orders>>((List<Orders>) orderRepo.findAll(), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Orders> saveOrder(@RequestBody Orders orders){
        return new ResponseEntity<Orders>(orderRepo.save(orders), HttpStatus.OK);
    }
}

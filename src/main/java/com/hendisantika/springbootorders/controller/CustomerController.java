package com.hendisantika.springbootorders.controller;

import com.hendisantika.springbootorders.model.Customer;
import com.hendisantika.springbootorders.repository.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-orders
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/11/17
 * Time: 07.34
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerRepo customerRepo;

    @GetMapping
    ResponseEntity<List<Customer>> getCustomers(){
        return new ResponseEntity<>((List<Customer>) customerRepo.findAll(), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        return new ResponseEntity<>(customerRepo.save(customer), HttpStatus.OK);
    }


}

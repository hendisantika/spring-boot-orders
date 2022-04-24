package com.hendisantika.springbootorders.controller;

import com.hendisantika.springbootorders.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-orders
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/04/22
 * Time: 10.22
 */
@RequiredArgsConstructor
@RequestMapping("products")
@Controller
@Slf4j
public class ProductWebController {
    private final ProductRepository productRepository;

//    @GetMapping("list")
//    public String listProduct(Model model) {
//
//
//    }
}

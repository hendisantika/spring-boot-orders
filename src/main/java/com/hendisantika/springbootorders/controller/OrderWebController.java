package com.hendisantika.springbootorders.controller;

import com.hendisantika.springbootorders.model.Orders;
import com.hendisantika.springbootorders.repository.OrderRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-orders
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/04/22
 * Time: 12.00
 */
@RequiredArgsConstructor
@Slf4j
@RequestMapping("orders")
@Controller
public class OrderWebController {
    private final OrderRepo orderRepo;

    @GetMapping("/list")
    public String listOrders(Model model) {
        List<Orders> orders = orderRepo.findAll();
        model.addAttribute("orders", orders);
        return "order/order_list";
    }
}
